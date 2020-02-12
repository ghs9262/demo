package com.example.demo.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface HandlerType {
    String value();
}
