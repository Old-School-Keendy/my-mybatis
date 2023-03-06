package it.wdz.mybatis.session;

import java.io.Reader;

import it.wdz.mybatis.builder.xml.XMLConfigBuilder;
import it.wdz.mybatis.session.defaults.DefaultSqlSessionFactory;

/**
 * @author wangdezhao
 * @date 2023/3/6
 * @description
 */
public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(Reader reader){
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config){
        return new DefaultSqlSessionFactory(config);
    }
}
