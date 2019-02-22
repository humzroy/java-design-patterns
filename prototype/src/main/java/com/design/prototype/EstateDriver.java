package com.design.prototype;

/**
 * 旅行车司机
 */
public class EstateDriver extends Driver {

    @Override
    protected EstateDriver clone() throws CloneNotSupportedException {
        return new EstateDriver();
    }

    @Override
    public String toString() {
        return "这是一名旅行车司机";
    }
}
