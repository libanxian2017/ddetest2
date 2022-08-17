package com.centit;

import com.centit.dde.user;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main
{
    public static void main(String[] args) {
       /* user user = new user();
        System.out.println("user="+user);*/
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //m1(ctx);
       //m2(ctx);
        user user3 = ctx.getBean("user3", user.class);
        System.out.println("user3="+user3);

    }

    private static void m2(ClassPathXmlApplicationContext ctx) {
        user user2 = ctx.getBean("user2", user.class);
        System.out.println(user2);
    }

    private static void m1(ClassPathXmlApplicationContext ctx) {
        user u1= (user) ctx.getBean("user");
        user u2 = ctx.getBean("user", user.class);
        user u3 = ctx.getBean(user.class);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
