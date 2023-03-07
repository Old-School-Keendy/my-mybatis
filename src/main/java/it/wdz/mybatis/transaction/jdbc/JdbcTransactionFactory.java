package it.wdz.mybatis.transaction.jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import it.wdz.mybatis.session.TransactionIsolationLevel;
import it.wdz.mybatis.transaction.Transaction;
import it.wdz.mybatis.transaction.TransactionFactory;

/**
 * @author wangdezhao
 * @date 2023/3/7
 * @description
 */
public class JdbcTransactionFactory implements TransactionFactory {
    @Override
    public Transaction newTransaction(Connection conn) {
        return new JdbcTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource, level, autoCommit);
    }
}
