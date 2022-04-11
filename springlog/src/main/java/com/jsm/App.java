package com.jsm;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  22:05
 */
@Slf4j
public class App {
    static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Log1.class);
        log.info("logback info 信息");
        logger.debug("测试一下debug");
    }
}
