package it.wdz.mybatis.datasource;

import java.util.Properties;

import javax.sql.DataSource;

/**
 * @author wangdezhao
 * @date 2023/3/7
 * @description
 */
public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();

}
