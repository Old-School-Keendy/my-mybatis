package it.wdz.mybatis.datasource.pooled;

import javax.sql.DataSource;

import it.wdz.mybatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @author wangdezhao
 * @date 2023/3/8
 * @description
 */
public class PooledDataSourceFactory extends UnpooledDataSourceFactory {
    @Override
    public DataSource getDataSource() {
        PooledDataSource pooledDataSource = new PooledDataSource();
        pooledDataSource.setDriver(props.getProperty("driver"));
        pooledDataSource.setUrl(props.getProperty("url"));
        pooledDataSource.setUsername(props.getProperty("username"));
        pooledDataSource.setPassword(props.getProperty("password"));
        return pooledDataSource;
    }
}
