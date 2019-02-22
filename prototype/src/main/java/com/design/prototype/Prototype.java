package com.design.prototype;

/**
 * 原型
 */
public abstract class Prototype implements Cloneable {

    @Override
    protected abstract Prototype clone() throws CloneNotSupportedException;
}
