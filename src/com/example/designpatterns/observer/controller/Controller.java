package com.example.designpatterns.observer.controller;

import com.example.designpatterns.observer.model.Model;
import com.example.designpatterns.observer.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
