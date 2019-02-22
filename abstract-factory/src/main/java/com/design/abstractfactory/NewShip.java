package com.design.abstractfactory;

/**
 * 新船
 */
public class NewShip implements Ship {

    static final String DESCRIPTION = "我是一艘崭新的船";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
