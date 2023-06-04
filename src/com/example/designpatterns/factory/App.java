package com.example.designpatterns.factory;

/*
* Factory pattern
* create objects implementing some interface
* or having some parent
*
* Creating on object is complex
* e.g. lots of constructor parameters
* Possible to categorize/simplify choice of objects
* */

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
        animal.speak();
    }
}
