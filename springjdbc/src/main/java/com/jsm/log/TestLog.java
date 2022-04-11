package com.jsm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther Justin-ming
 * @Date 2022/3/24  9:56
 */
public class TestLog {

    private static final Logger log = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        log.info("jjsjsjs");
        log.warn("jjjjjjjjj");
    }
}
