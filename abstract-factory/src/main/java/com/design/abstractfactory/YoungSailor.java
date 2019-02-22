package com.design.abstractfactory;

/**
 * 年轻水手
 */
public class YoungSailor implements Sailor {

    static final String DESCRIPTION = "我是年轻的水手";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
