package com.example.designpatterns.beans;

import java.sql.Connection;


public class Database {
    private static Database instance = new Database();

    private Connection con;

    private Database() {

    }

    public static Database getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database.");
    }

    public void disconnect() {
        System.out.println("Disconnected.");
    }
}
