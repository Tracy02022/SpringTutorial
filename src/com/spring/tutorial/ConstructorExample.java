package com.spring.tutorial;

public class ConstructorExample {

    private int id;
    private String name;

    public  ConstructorExample(int id, String name) {

        this.id = id;
        this.name = name;

    }

    public void showValues() {
        System.out.println("id is " + id + " name is " + name);
    }


    public static void main(String[] args) {
        ConstructorExample cExample = new ConstructorExample(10, "name");
        cExample.showValues();
    }
}
