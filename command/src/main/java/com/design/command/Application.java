package com.design.command;

/**
 * Command
 */
public class Application {

    public static void main(String[] args) {
        Typist sizeTypist = new Typist();
        Typist colorTypist = new Typist();
        RegularScript font = new RegularScript();

        Command rubify = new Rubify(font);
        Command enlarge = new Enlarge(font);

        font.printStatus();

        // 设置字体颜色
        colorTypist.cast(rubify, font);
        font.printStatus();

        // 设置字体大小
        sizeTypist.cast(enlarge, font);
        font.printStatus();

        // 撤销颜色更改
        colorTypist.undo();
        font.printStatus();
        colorTypist.undo();

        // 撤销大小更改
        sizeTypist.undo();
        font.printStatus();
        sizeTypist.undo();

        // 字体颜色重做
        colorTypist.redo();
        font.printStatus();
        colorTypist.redo();

        // 大小重做
        sizeTypist.redo();
        font.printStatus();
        sizeTypist.redo();
    }
}
