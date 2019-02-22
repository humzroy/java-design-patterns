package com.design.command;

/**
 * 设置字体颜色为红色的命令
 */
public class Rubify extends Command {

    private final AbstractFont font;
    private final Color oriColor;

    public Rubify(AbstractFont font) {
        this.font = font;
        oriColor = font.getColor();
    }

    @Override
    public void execute() {
        font.setColor(Color.RED);
    }

    @Override
    public void undo() {
        font.setColor(oriColor);
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public String toString() {
        return "设置字体为红色";
    }
}
