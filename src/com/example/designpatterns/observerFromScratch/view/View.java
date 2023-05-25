package com.example.designpatterns.observerFromScratch.view;

import com.example.designpatterns.observerFromScratch.controller.Controller;
import com.example.designpatterns.observerFromScratch.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;
    private LoginListener loginListener;
    public View(Model model) throws HeadlessException {
        super("MVC Demo");

        this.model = model;
    }

    // expect something as the interface
    // some specific method needs to be implemented
    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }


}
