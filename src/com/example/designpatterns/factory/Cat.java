package com.example.designpatterns.factory;

// assume that it's difficult to instantiate Cat object
public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
