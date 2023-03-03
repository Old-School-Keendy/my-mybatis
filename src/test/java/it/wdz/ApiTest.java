package it.wdz;

import java.util.HashMap;

import it.wdz.dao.IUserDao;
import it.wdz.mybatis.binding.MapperProxyFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 小傅哥，微信：fustack
 * @description 单元测试，源码对照测试类
 * @date 2022/3/26
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory(){
        MapperProxyFactory<IUserDao> mapperProxyFactory = new MapperProxyFactory<>(IUserDao.class);
        HashMap<String, String> sqlSessions = new HashMap<>();
        sqlSessions.put("it.wdz.dao.IUserDao.queryUserName","执行queryUserName方法 name: keendy");
        sqlSessions.put("it.wdz.dao.IUserDao.queryUserAge","执行queryUserAge方法 age: 12");
        IUserDao userDao = mapperProxyFactory.newInstance(sqlSessions);
        String userName = userDao.queryUserName("11");
        System.out.println(userName);
    }

}
