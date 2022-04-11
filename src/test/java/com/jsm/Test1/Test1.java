package com.jsm.Test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Auther Justin-ming
 * @Date 2022/3/16  17:34
 */
public class Test1 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//     var d = ctx.getBean("j", Date.class);
//     var d1 =  ctx.getBean("s");
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        int s = ctx.getBeanDefinitionCount();
        System.out.println(s);
    }
}
