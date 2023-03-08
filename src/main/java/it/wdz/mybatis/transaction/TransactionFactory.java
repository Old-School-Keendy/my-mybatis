package it.wdz.mybatis.transaction;

import java.sql.Connection;

import javax.sql.DataSource;

import it.wdz.mybatis.session.TransactionIsolationLevel;

/**
 * @author wangdezhao
 * @date 2023/3/7
 * @description 以工厂方法模式包装 JDBC 事务实现，为每一个事务实现都提供一个对应的工厂。与简单工厂的接口包装不同。
 */
public interface TransactionFactory {
    /**
     * 根据 Connection 创建 Transaction
     *
     * @param conn Existing database connection
     * @return Transaction
     */
    Transaction newTransaction(Connection conn);

    /**
     * 根据数据源和事务隔离级别创建 Transaction
     *
     * @param dataSource DataSource to take the connection from
     * @param level      Desired isolation level
     * @param autoCommit Desired autocommit
     * @return Transaction
     */
    Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);

}
