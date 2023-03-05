package it.wdz.mybatis.session;

/**
 * @author wangdezhao
 * @date 2023/3/5
 * @description
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
