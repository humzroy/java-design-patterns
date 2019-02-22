package com.design.prototype;

/**
 * 司机
 */
public abstract class Driver extends Prototype {

    @Override
    protected abstract Driver clone() throws CloneNotSupportedException;
}
