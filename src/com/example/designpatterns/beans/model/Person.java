package com.example.designpatterns.beans.model;

// A bean, light weight class
public class Person {
    private int id;
    private String name;
    private String password; // probably need some encryption

    // no args contructors
    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
