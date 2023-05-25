package com.example.designpatterns.observerFromScratch;

import com.example.designpatterns.observerFromScratch.controller.Controller;
import com.example.designpatterns.observerFromScratch.model.Model;
import com.example.designpatterns.observerFromScratch.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        // model never import anything from view/controller
        Model model = new Model();

        // listen to view using contoller
        View view = new View(model);
        Controller controller = new Controller(view, model);

        view.setLoginListener(controller);
    }
}
