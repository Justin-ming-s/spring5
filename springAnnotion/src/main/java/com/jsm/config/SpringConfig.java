package com.jsm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.source.tree.ReturnTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Date;

/**
 * @Auther Justin-ming
 * @Date 2022/3/16  17:48
 */
@Configuration
@ComponentScan("com.jsm.config")
public class SpringConfig {
    @Bean()
    public Date jj() {
        return new Date();
    }

    @Bean
    public DataSource db() {
        DruidDataSource ds = new DruidDataSource();
        ds.setUsername("root");
        ds.setPassword("2061");
        ds.setUrl("jdbc:mysql://:3305/db");
        return ds;
    }
}
