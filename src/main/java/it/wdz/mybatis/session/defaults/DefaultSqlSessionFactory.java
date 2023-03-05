package it.wdz.mybatis.session.defaults;

import it.wdz.mybatis.binding.MapperRegistry;
import it.wdz.mybatis.session.SqlSession;
import it.wdz.mybatis.session.SqlSessionFactory;

/**
 * @author wangdezhao
 * @date 2023/3/5
 * @description
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
