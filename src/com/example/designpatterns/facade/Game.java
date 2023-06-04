package com.example.designpatterns.facade;

// Facade class
// create simplify API to manipulate different objects
public class Game {
    private InputSystem inputSystem = new InputSystem();
    private GameObjects gameObject = new GameObjects();
    private GameConsole gameConsole = new GameConsole();

    public void update() {
        // Input
        inputSystem.getInput();
        // Update game objects (player, xxx)
        gameObject.update(inputSystem);
        // Draw game objects
        gameConsole.draw();
    }
}
