package it.wdz.mybatis.binding;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author wangdezhao
 * @date 2023/3/3
 * @description
 */
public class MapperProxy<T> implements InvocationHandler, Serializable {

    private Map<String, String> sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(Map<String, String> sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 如果是 Object 提供的 toString、hashCode 等方法是不需要代理执行的
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        }
        return "你的被代理了! " + sqlSession.get(mapperInterface.getName() + "." + method.getName());
    }
}
