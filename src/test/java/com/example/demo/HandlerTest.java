package com.example.demo;

import com.example.demo.common.HandlerContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HandlerTest {
    @Resource
    private HandlerContext handlerContext;


    @Test

    public void test() {
        handlerContext.getInstance("1").handler("123");
    }
}
