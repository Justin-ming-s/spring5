package com.jsm.aop;

import org.springframework.stereotype.Component;

/**
 * @Auther Justin-ming
 * @Date 2022/3/18  21:28
 */
//被增强的类
@Component
public class User {
    public void add() {
        System.out.println("add...");
    }
}
