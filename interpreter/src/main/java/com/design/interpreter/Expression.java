package com.design.interpreter;

/**
 * 表达式
 */
public abstract class Expression {

    public abstract int interpret() throws Exception;

    @Override
    public abstract String toString();
}
