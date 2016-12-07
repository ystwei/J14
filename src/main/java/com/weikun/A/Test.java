package com.weikun.A;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Chinese chinese=(Chinese)ctx.getBean("chinese");
        System.out.println(chinese);
        Chinese chinese1=(Chinese)ctx.getBean("chinese");
        System.out.println(chinese1);

        StoneAxe axe=(StoneAxe)ctx.getBean("stone");

        //chinese.setAxe(axe);
        chinese.useAxe();

    }
}
