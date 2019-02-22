package com.design.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字体抽象类
 */
public abstract class AbstractFont {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFont.class);

    private Size size;
    private Color color;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public abstract String toString();

    /**
     * 打印当前状态
     */
    public void printStatus() {
        LOGGER.info("字体当前状态为：\t字体大小：{}\t颜色：{}", getSize(), getColor());
    }
}
