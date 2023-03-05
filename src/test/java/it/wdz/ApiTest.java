package it.wdz;

import java.util.Map;

import it.wdz.dao.ISchoolDao;
import it.wdz.dao.IUserDao;
import it.wdz.mybatis.binding.MapperProxyFactory;
import it.wdz.mybatis.binding.MapperRegistry;
import it.wdz.mybatis.session.SqlSession;
import it.wdz.mybatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
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
    public void test(){
        // 1. 注册 Mapper
        MapperRegistry mapperRegistry = new MapperRegistry();
        mapperRegistry.addMappers("it.wdz.dao");

        // 2. 从 SqlSession 工厂获取 Session
        DefaultSqlSessionFactory defaultSqlSessionFactory = new DefaultSqlSessionFactory(mapperRegistry);
        SqlSession sqlSession = defaultSqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        ISchoolDao schoolDao = sqlSession.getMapper(ISchoolDao.class);

        // 4. 测试验证
        logger.info("userDao.queryUserName: " + userDao.queryUserName("10").toString());
        logger.info("schoolDao.querySchoolName: " + schoolDao.querySchoolName("22"));
    }

}
