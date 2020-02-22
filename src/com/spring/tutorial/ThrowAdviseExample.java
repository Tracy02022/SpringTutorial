package com.spring.tutorial;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdviseExample implements ThrowsAdvice {

    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("Exception Occured! ");
    }
}
