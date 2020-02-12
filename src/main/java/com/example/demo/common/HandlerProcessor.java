package com.example.demo.common;

import com.example.demo.annotation.HandlerType;
import com.example.demo.util.ClassScaner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {
    private static final String packageName = "com.example.demo.handler";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<String, Class> map = new HashMap<String, Class>();
        ClassScaner.scan(packageName, HandlerType.class).forEach(clazz -> {
            String type = ((HandlerType) clazz.getAnnotation(HandlerType.class)).value();
            map.put(type, clazz);
        });

        HandlerContext hc = new HandlerContext(map);
        configurableListableBeanFactory.registerSingleton(hc.getClass().getName(), hc);
    }
}
