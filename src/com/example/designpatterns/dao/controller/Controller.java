package com.example.designpatterns.dao.controller;

import java.sql.SQLException;

import com.example.designpatterns.dao.model.Model;
import com.example.designpatterns.dao.model.Person;
import com.example.designpatterns.dao.model.PersonDAO;
import com.example.designpatterns.dao.view.CreateUserEvent;
import com.example.designpatterns.dao.view.CreateUserListener;
import com.example.designpatterns.dao.view.View;

// listen to the form
public class Controller implements CreateUserListener {
	private View view;
	private Model model;
	
	private PersonDAO personDAO = new PersonDAO();
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

		// fill in the person object
		// probably need some validation
		try {
			// controller telling the model what to do
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
