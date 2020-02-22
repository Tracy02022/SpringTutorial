package com.spring.tutorial;

public class SpringConstructorInjection {

    private int id;
    private String name;

    public SpringConstructorInjection (int id, String name) {

        this.id = id;
        this.name = name;
    }


    public void showInjectedValues() {
        System.out.println("id is " + id + " name is " + name);
    }
}


