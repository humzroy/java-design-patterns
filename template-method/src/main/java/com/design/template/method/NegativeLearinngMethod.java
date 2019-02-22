package com.design.template.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消极的学习方法
 */
public class NegativeLearinngMethod extends LearningMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(NegativeLearinngMethod.class);

    @Override
    protected String preLearning() {
        return "几乎没有预习，对上课要学的内容一无所知";
    }

    @Override
    protected void Learning(String description) {
        LOGGER.info("学习状态：{}", description);
    }

    @Override
    protected void afterLearning(String adviser) {
        if (!adviser.equals("")) {
            LOGGER.info("只有很少的知识点没有听懂，于是找{}提问", adviser);
        }
    }
}
