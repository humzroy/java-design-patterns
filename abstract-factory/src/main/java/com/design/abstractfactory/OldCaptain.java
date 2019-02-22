package com.design.abstractfactory;

/**
 * 老船长
 */
public class OldCaptain implements Captain {

    static final String DESCRIPTION = "我是一名老船长";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
