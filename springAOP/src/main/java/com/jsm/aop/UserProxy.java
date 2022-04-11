package com.jsm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther Justin-ming
 * @Date 2022/3/18  21:28
 */
//增强的类
@Component
@Aspect
public class UserProxy {
    @Before(value = "execution(* com.jsm.aop.*.add(..))")
    public void before() {
        System.out.println("before...");
    }

    @After(value = "execution(* com.jsm.aop.*.add(..))")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning(value = "execution(* com.jsm.aop.*.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing(value = "execution(* com.jsm.aop.*.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @Around(value = "execution(* com.jsm.aop.*.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around...");
        proceedingJoinPoint.proceed();
        System.out.println("around.......");
    }
}
