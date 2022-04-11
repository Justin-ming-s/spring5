package com.jsm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  16:28
 */
@Configuration
@Component
public class Spring5 {

    @Bean
    public Date date() {
        return new Date();
    }

    @Bean
    public SimpleDateFormat simple() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        return simpleDateFormat;

    }

}
