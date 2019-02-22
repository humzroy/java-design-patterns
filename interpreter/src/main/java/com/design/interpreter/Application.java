package com.design.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * Interpreter
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        try {
            String tokenString = "5 3 2 1 + 2 * 3 /";
            Stack<Expression> stack = new Stack<>();

            String[] stringList = tokenString.split(" ");
            for (String s : stringList) {
                if (isOperator(s)) {
                    Expression expressionRight = stack.pop();
                    Expression expressionLeft = stack.pop();
                    LOGGER.info("左操作数：{}，右操作数：{}", expressionLeft.interpret(), expressionRight.interpret());
                    Expression expression = getExpressionInstance(s, expressionLeft, expressionRight);
                    LOGGER.info("操作符：{}", expression);
                    Expression result;
                    if (expression != null) {
                        result = new NumberExpression(expression.interpret());
                        LOGGER.info("运算结果为：{}", result.interpret());
                        stack.push(result);
                    }
                } else {
                    NumberExpression expression = new NumberExpression(s);
                    stack.push(expression);
                    LOGGER.info("数字入栈：{}", expression.interpret());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断字符串是否为四则运算的操作符
     *
     * @param s 待判断的字符串
     * @return 是否为操作符
     */
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    /**
     * 根据字符串生成四则运算表达式
     *
     * @param s               字符串
     * @param expressionLeft  左表达式
     * @param expressionRight 右表达式
     * @return 四则运算表达式
     */
    public static Expression getExpressionInstance(String s, Expression expressionLeft, Expression expressionRight) {
        if (isOperator(s)) {
            switch (s) {
                case "+": {
                    return new PlusExpression(expressionLeft, expressionRight);
                }
                case "-": {
                    return new MinusExpression(expressionLeft, expressionRight);
                }
                case "*": {
                    return new MultipleExpression(expressionLeft, expressionRight);
                }
                case "/": {
                    return new DivisionExpression(expressionLeft, expressionRight);
                }
            }
        }
        return null;
    }
}
