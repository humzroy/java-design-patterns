package com.design.adapter;

/**
 * 公共汽车适配器
 */
public class BusAdapter implements Car {

    private Bus bus;

    public BusAdapter() {
        this.bus = new Bus();
    }

    @Override
    public void drive() {
        bus.run();
    }
}
