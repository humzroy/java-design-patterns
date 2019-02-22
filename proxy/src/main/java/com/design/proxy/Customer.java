package com.design.proxy;

/**
 * 顾客
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
