package it.wdz.mybatis.builder;

import it.wdz.mybatis.session.Configuration;

/**
 * @author wangdezhao
 * @date 2023/3/6
 * @description
 */
public abstract class BaseBuilder {
    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
