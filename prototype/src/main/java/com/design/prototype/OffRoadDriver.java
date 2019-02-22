package com.design.prototype;

/**
 * 越野车司机
 */
public class OffRoadDriver extends Driver {

    @Override
    protected OffRoadDriver clone() throws CloneNotSupportedException {
        return new OffRoadDriver();
    }

    @Override
    public String toString() {
        return "这是一名越野车司机";
    }
}
