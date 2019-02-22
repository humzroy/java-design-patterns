package com.design.adapter;

/**
 * 公交车司机
 */
public class Driver implements Car {

    private Car car;

    @Override
    public void drive() {
        car.drive();
    }

    public Driver(Car car) {
        this.car = car;
    }
}
