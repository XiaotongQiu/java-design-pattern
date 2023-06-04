package com.example.designpatterns.dao.model;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    @Before
    void setUp() {
        // connect to db

        PersonDAO dao = DAOFactory.getPersonDAO();

    }

    @AfterClass
    void tearDownAfterClass() {
        // disconnect from db
    }

    @org.junit.jupiter.api.Test
    void addPerson() throws SQLException {
        PersonDAO dao = DAOFactory.getPersonDAO();

        Person person1 = new Person("Bob", "sdajgfs");
        Person person2 = new Person("Sue", "sjlfsnv");

        dao.addPerson(person1);
        dao.addPerson(person2);

        List<Person> people = dao.getPeople();

        assertEquals(2, people.size(), "Should be two people");
        assertEquals(person1, people.get(0), "These two people should be the same");


    }

    @org.junit.jupiter.api.Test
    void getPerson() {
    }

    @org.junit.jupiter.api.Test
    void getPeople() {
    }

    @org.junit.jupiter.api.Test
    void updatePerson() {
    }

    @org.junit.jupiter.api.Test
    void deletePerson() {
    }

    @Test
    void testSomething() {
        int value = 7;
        value += 2;

        assertEquals(9, value, "check that arithmetic works in Java!");
    }
}