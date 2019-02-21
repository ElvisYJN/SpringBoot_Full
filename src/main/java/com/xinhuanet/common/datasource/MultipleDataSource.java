package com.xinhuanet.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey  = new ThreadLocal<String>();
    
    public static void setDataSourceKey(String dataSource){
        dataSourceKey.set(dataSource);
    }
    
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
