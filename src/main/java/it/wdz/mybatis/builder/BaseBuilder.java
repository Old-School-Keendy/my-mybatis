package it.wdz.mybatis.builder;

import it.wdz.mybatis.session.Configuration;
import it.wdz.mybatis.type.TypeAliasRegistry;

/**
 * @author wangdezhao
 * @date 2023/3/6
 * @description
 */
public abstract class BaseBuilder {

    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }

}