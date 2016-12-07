package com.weikun.B;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person russian=(Person)ctx.getBean("russian");

        russian.say("AOP");
       // System.out.println("-----");
       // russian.ok();
    }
}
