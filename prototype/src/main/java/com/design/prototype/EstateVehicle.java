package com.design.prototype;

/**
 * 旅行车
 */
public class EstateVehicle extends Vehicle {

    @Override
    protected EstateVehicle clone() throws CloneNotSupportedException {
        return new EstateVehicle();
    }

    @Override
    public String toString() {
        return "这是一辆旅行车";
    }
}
