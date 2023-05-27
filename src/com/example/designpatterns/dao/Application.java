package com.example.designpatterns.dao;

import javax.swing.SwingUtilities;

import com.example.designpatterns.dao.controller.Controller;
import com.example.designpatterns.dao.model.Model;
import com.example.designpatterns.dao.view.View;

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
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
