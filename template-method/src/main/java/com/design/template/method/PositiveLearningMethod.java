package com.design.template.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 积极的学习方法
 */
public class PositiveLearningMethod extends LearningMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(PositiveLearningMethod.class);

    @Override
    protected String preLearning() {
        return "预习到位，为听课打下很好的基础";
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
