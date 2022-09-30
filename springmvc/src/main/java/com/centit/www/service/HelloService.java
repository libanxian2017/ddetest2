package com.centit.www.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String Hello(String name){
        return  "Hello"+name;
    }
}
