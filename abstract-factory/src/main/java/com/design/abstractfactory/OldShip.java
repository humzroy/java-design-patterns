package com.design.abstractfactory;

/**
 * 旧船
 */
public class OldShip implements Ship {

    static final String DESCRIPTION = "我是一艘破旧的船";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
