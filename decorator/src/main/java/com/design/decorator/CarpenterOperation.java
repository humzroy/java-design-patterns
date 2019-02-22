package com.design.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 木匠的工作
 */
public class CarpenterOperation implements Operation {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarpenterOperation.class);

    @Override
    public void checkBefore() {
        LOGGER.info("检查木材");
    }

    @Override
    public void join() {
        LOGGER.info("打造锤把");
    }

    @Override
    public void chekcAfter() {
        LOGGER.info("检查成品锤把");
    }
}
