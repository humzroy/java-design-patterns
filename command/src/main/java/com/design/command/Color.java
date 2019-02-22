package com.design.command;

/**
 * 字体颜色
 */
public enum Color {

    RED("红"), BLACK("黑");

    private String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
