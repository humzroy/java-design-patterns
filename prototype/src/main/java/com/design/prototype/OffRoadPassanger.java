package com.design.prototype;

/**
 * 越野车乘客
 */
public class OffRoadPassanger extends Passenger {

    @Override
    protected OffRoadPassanger clone() throws CloneNotSupportedException {
        return new OffRoadPassanger();
    }

    @Override
    public String toString() {
        return "这是一名越野车乘客";
    }
}
