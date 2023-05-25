package com.example.designpatterns.mvc.view;

import com.example.designpatterns.mvc.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;
    public View(Model model) throws HeadlessException {
        super("MVC Demo");

        this.model = model;
    }
}
