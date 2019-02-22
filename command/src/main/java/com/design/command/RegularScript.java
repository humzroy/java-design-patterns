package com.design.command;

/**
 * 字体
 */
public class RegularScript extends AbstractFont {

    public RegularScript() {
        setColor(Color.BLACK);
        setSize(Size.SMALL);
    }

    @Override
    public String toString() {
        return "楷体";
    }
}
