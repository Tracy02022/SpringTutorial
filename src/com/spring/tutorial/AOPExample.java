package com.spring.tutorial;

public class AOPExample {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showValues() {
        //System.out.println("Name is " + name + " id is " + id);
        throw new IllegalArgumentException();
    }


}
