package com.design.template.method;

/**
 * 学生
 */
public class Student {

    private LearningMethod method;

    public Student(LearningMethod method) {
        this.method = method;
    }

    /**
     * 学习
     *
     * @param description 状态
     * @param adviser     请教对象
     */
    public void learn(String description, String adviser) {
        method.learn(description, adviser);
    }

    /**
     * 更换学习方法
     *
     * @param method
     */
    public void changeMethod(LearningMethod method) {
        this.method = method;
    }
}
