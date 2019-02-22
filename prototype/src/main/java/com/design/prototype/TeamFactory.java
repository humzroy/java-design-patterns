package com.design.prototype;

/**
 * 团队工厂接口
 */
public interface TeamFactory {

    Driver createDriver();

    Passenger createPassenger();

    Vehicle createVehicle();
}
