package com.centit.www.service;

import com.centit.www.Action;
import org.springframework.stereotype.Component;

@Component
public class MyCalculatorImpl implements MyCalculator {
    @Override
    //@Action
    public int add(int a, int b) {
       // int i=1/0;
        System.out.println(a+"+"+b+"="+(a+b));
        return a+b;
    }

    @Override
   // @Action
    public void min(int a, int b) {
        System.out.println(a+"-"+b+"="+(a-b));

    }
}
