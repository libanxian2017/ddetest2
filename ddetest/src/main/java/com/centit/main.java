package com.centit;

import com.centit.dde.user;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main
{
    public static void main(String[] args) {
       /* user user = new user();
        System.out.println("user="+user);*/
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        user u1= (user) ctx.getBean("user");
        user u2 = ctx.getBean("user", user.class);
        System.out.println(u1);
        System.out.println(u2);


    }
}
