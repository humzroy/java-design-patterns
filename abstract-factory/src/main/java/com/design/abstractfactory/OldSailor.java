package com.design.abstractfactory;

/**
 * 老水手
 */
public class OldSailor implements Sailor {

    static final String DESCRIPTION = "我是一名老水手";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
