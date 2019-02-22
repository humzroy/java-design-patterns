package com.design.command;

/**
 * 设置字体为大号
 */
public class Enlarge extends Command {

    private final AbstractFont font;
    private final Size oriSize;

    public Enlarge(AbstractFont font) {
        this.font = font;
        oriSize = font.getSize();
    }

    @Override
    public void execute() {
        font.setSize(Size.LARGE);
    }

    @Override
    public void undo() {
        font.setSize(oriSize);
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public String toString() {
        return "设置字体为大号";
    }
}
