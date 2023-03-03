package it.wdz.mybatis.binding;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author wangdezhao
 * @date 2023/3/3
 * @description
 */
public class MapperProxyFactory<T> {
    private final Class<T> mapperInterface;

    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public T newInstance(Map<String,String> sqlSession){
        MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession, this.mapperInterface);
        return (T)Proxy.newProxyInstance(mapperInterface.getClassLoader(),new Class[]{mapperInterface},mapperProxy);
    }
}
