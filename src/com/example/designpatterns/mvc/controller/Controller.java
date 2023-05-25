package com.example.designpatterns.mvc.controller;

import com.example.designpatterns.mvc.model.Model;
import com.example.designpatterns.mvc.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
