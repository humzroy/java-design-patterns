package com.design.interpreter;

/**
 * 减法表达式
 */
public class MinusExpression extends Expression {

    private Expression expressionLeft;
    private Expression expressionRight;

    public MinusExpression(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() throws Exception {
        return expressionLeft.interpret() - expressionRight.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}
