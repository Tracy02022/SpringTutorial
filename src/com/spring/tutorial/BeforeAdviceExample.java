package com.spring.tutorial;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdviceExample implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o)
            throws Throwable {
        System.out.println("Before advise! ");
    }
}
