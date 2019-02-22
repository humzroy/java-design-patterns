package com.design.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Decorator
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("仅由木匠制作锤把");
        Operation carpenter = new CarpenterOperation();
        carpenter.checkBefore();
        carpenter.join();
        carpenter.chekcAfter();

        LOGGER.info("由铁匠完成锤把以及锤头的制作");
        Operation hammerSmith = new HammerSmithOperation(carpenter);
        hammerSmith.checkBefore();
        hammerSmith.join();
        hammerSmith.chekcAfter();
    }
}
