package com.design.template.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Template method
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Student student = new Student(new PositiveLearningMethod());
        student.learn("上课走神", "同学");
        LOGGER.info("更换学习方法");
        student.changeMethod(new NegativeLearinngMethod());
        student.learn("认证听讲", "老师");
    }
}
