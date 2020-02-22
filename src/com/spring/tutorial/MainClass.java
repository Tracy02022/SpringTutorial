package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {


    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

//        SetterInjectionExample helloSpring = (SetterInjectionExample)applicationContext.getBean("setterInject");
//
//        System.out.println(helloSpring.getId());
//        System.out.println(helloSpring.getName());

//        InjectCollections playInstrument = (InjectCollections)applicationContext.getBean("injectionCollections");
//
//        System.out.println(playInstrument.getIntegerList());
//        System.out.println(playInstrument.getIntegerSet());
//        System.out.println(playInstrument.getMap());


        AOPExample aopExample = (AOPExample)applicationContext.getBean("aopExampleBean");
        aopExample.showValues();

        applicationContext.close();
    }
}
