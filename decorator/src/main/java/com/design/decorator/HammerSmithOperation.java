package com.design.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 铁匠
 */
public class HammerSmithOperation implements Operation {

    private static final Logger LOGGER = LoggerFactory.getLogger(HammerSmithOperation.class);
    private Operation previousOperation;

    public HammerSmithOperation(Operation previousOperation) {
        this.previousOperation = previousOperation;
    }

    @Override
    public void checkBefore() {
        previousOperation.checkBefore();
        LOGGER.info("检查铁材");
    }

    @Override
    public void join() {
        previousOperation.join();
        LOGGER.info("打造锤头");
    }

    @Override
    public void chekcAfter() {
        previousOperation.chekcAfter();
        LOGGER.info("检查成品锤头");
    }
}
