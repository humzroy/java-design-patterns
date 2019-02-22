package com.design.prototype;

/**
 * 旅行车乘客
 */
public class EstatePassanger extends Passenger {

    @Override
    protected EstatePassanger clone() throws CloneNotSupportedException {
        return new EstatePassanger();
    }

    @Override
    public String toString() {
        return "这是一名旅行车乘客";
    }
}
