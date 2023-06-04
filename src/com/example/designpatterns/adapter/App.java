package com.example.designpatterns.adapter;

public class App {
    public static void main(String[] args) {
        // use ConsoleLogWriter as an intermediate class to adapt ConsoleWriter to Logger

        // composition
        ConsoleLogWriter consoleLogWriter = new ConsoleLogWriter();
        Logger logger = new Logger(consoleLogWriter);
        logger.write("Hello there.");

        // inheritance
        ConsoleLogWriter2 consoleLogWriter2 = new ConsoleLogWriter2();
        Logger logger2 = new Logger(consoleLogWriter2);
        logger2.write("Hello there 2.");
    }
}
