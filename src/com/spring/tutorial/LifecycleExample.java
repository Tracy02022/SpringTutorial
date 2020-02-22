package com.spring.tutorial;

public class LifecycleExample {

    private String name;

    public void onInitialization() {
        System.out.println("Init method called !");
    }


    public  void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("name is  " + name);
    }

    public void onDestroy() {
        System.out.println("Destory method called! ");
    }
}
