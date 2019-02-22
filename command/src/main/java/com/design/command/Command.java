package com.design.command;

/**
 * 命令抽象类
 */
public abstract class Command {

    public abstract void execute();

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
