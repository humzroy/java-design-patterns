package com.design.interpreter;

/**
 * 数字表达式
 */
public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String numberString) {
        this.number = Integer.parseInt(numberString);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "数字";
    }
}
