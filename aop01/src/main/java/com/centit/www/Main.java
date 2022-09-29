package com.centit.www;

import com.centit.www.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculator calculator = ctx.getBean(MyCalculator.class);
        calculator.add(3,4);
        calculator.min(5,2);

    }
}
