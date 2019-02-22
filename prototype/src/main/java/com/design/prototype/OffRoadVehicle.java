package com.design.prototype;

/**
 * 越野车
 */
public class OffRoadVehicle extends Vehicle {

    @Override
    protected OffRoadVehicle clone() throws CloneNotSupportedException {
        return new OffRoadVehicle();
    }

    @Override
    public String toString() {
        return "这是一辆越野车";
    }
}
