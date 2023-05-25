package com.example.designpatterns.mvc;

import com.example.designpatterns.mvc.controller.Controller;
import com.example.designpatterns.mvc.model.Model;
import com.example.designpatterns.mvc.view.View;

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

        // view of model -> pass reference of model to view
        View view = new View(model);

        // controller tells model/view what to do (Or listen)
        Controller controller = new Controller(view, model);
    }
}
