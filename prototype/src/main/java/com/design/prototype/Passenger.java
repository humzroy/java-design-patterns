package com.design.prototype;

/**
 * 乘客
 */
public abstract class Passenger extends Prototype {

    @Override
    protected abstract Passenger clone() throws CloneNotSupportedException;
}
