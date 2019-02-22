package com.design.abstractfactory;

/**
 * 年轻船长
 */
public class YoungCaptain implements Captain {

    static final String DESCRIPTION = "我是一名年轻的船长";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
