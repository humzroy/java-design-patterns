package com.design.command;

/**
 * 字体大小
 */
public enum Size {

    LARGE("大"), SMALL("小");

    private String name;

    Size(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
