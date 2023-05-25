package com.example.designpatterns.observerFromScratch.controller;

import com.example.designpatterns.observerFromScratch.model.Model;
import com.example.designpatterns.observerFromScratch.view.LoginFormEvent;
import com.example.designpatterns.observerFromScratch.view.LoginListener;
import com.example.designpatterns.observerFromScratch.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received. " + event.getName() + "; " + event.getPassword());
    }
}
