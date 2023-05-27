package com.example.designpatterns.singleton;

import javax.xml.crypto.Data;

public class Database {

    // cannot new Database object out of the class by using private constructor
    // get the object by Database.getInstance()

    private Database() {

    }

    // eager instantiation
    private static Database instance = new Database();
    public Database getInstance() {
        // return the ONLY instance
        return instance;
    }

    // lazy instantiation
    // to speed up start of the program
    // disadvantage: not thread safe!
    // thread1&thread2 call getInstanceOld at the same time, they may create instances at the same time
    private static Database instanceOld;
    public static Database getInstanceOld() {
        if (instanceOld == null) {
            instanceOld = new Database();
        }

        return instanceOld;
    }

    public void connect() {
        System.out.println("Connected to database.");
    }

    public void disconnect() {
        System.out.println("Disconnected.");
    }
}
