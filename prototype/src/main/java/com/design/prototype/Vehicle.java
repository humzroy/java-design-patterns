package com.design.prototype;

/**
 * 车
 */
public abstract class Vehicle extends Prototype {

    @Override
    protected abstract Vehicle clone() throws CloneNotSupportedException;
}
