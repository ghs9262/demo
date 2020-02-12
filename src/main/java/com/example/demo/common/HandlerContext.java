package com.example.demo.common;

import com.example.demo.handler.AbstarctHandler;
import com.example.demo.util.SpringUtil;

import java.util.Map;


public class HandlerContext {



    private Map<String,Class> handlerMap;


    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstarctHandler getInstance(String type){

        Class clazz =  handlerMap.get(type);
        if(clazz==null){
            throw new RuntimeException("not found type is"+type+" class");
        }


        return (AbstarctHandler) SpringUtil.getObject(clazz);

    }

}
