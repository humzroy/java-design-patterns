package com.design.template.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 学习方法的抽象类
 */
public abstract class LearningMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(LearningMethod.class);

    /**
     * 预习效果
     *
     * @return
     */
    protected abstract String preLearning();

    /**
     * 状态
     *
     * @param description 学习状态
     */
    protected abstract void Learning(String description);

    /**
     * 请教对象
     *
     * @param adviser 请教对象
     */
    protected abstract void afterLearning(String adviser);

    /**
     * 学习过程
     *
     * @param description 听课状态
     * @param adviser     请假对象
     */
    public void learn(String description, String adviser) {
        String preLearningResult = preLearning();
        LOGGER.info("{}", preLearningResult);
        Learning(description);
        afterLearning(adviser);
    }
}
