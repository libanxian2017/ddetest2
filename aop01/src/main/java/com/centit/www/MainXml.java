package com.centit.www;

import com.centit.www.service.MyCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator myCalculator = ctx.getBean(MyCalculator.class);
        myCalculator.add(6,7);
        myCalculator.min(9,7);

    }
}
