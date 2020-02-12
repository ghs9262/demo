package com.example.demo.handler;


import com.example.demo.annotation.HandlerType;
import org.springframework.stereotype.Component;

@HandlerType("1")
@Component
public class Test1Handler extends AbstarctHandler {
    @Override
    public String handler(String test) {
        System.out.println("test1=================");
        return null;
    }
}
