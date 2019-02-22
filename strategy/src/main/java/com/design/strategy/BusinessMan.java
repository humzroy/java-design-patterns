package com.design.strategy;

/**
 * 商人
 */
public class BusinessMan {

    private TransportationStrategy strategy;

    public BusinessMan(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changetStrategy(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void transport() {
        this.strategy.go();
    }
}
