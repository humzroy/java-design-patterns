package com.design.adapter;

/**
 * Adapter
 */
public class Application {

    public static void main(String[] args) {
        Driver driver = new Driver(new BusAdapter());
        driver.drive();
    }
}
