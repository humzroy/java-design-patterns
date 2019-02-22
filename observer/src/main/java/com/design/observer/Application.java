package com.design.observer;

/**
 * Observer
 */
public class Application {

    public static void main(String[] args) {
        Time time = new Time();
        time.addObserver(new Northern());
        time.addObserver(new Southern());

        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
        time.passing();
    }
}
