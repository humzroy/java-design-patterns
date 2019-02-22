package com.design.interpreter;

/**
 * 除法表达式
 */
public class DivisionExpression extends Expression {

    private Expression expressionLeft;
    private Expression expressionRight;

    public DivisionExpression(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() throws Exception {
        return expressionLeft.interpret() / expressionRight.interpret();
    }

    @Override
    public String toString() {
        return "/";
    }
}
