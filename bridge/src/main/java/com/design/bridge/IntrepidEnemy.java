package com.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 强大的敌人
 */
public class IntrepidEnemy implements Enemy {

    private static final Logger LOGGER = LoggerFactory.getLogger(IntrepidEnemy.class);

    @Override
    public void onStartWar() {
        LOGGER.info("敌人信心满满，准备迎战");
    }

    @Override
    public void onCombatting() {
        LOGGER.info("敌人正在积极反抗");
    }

    @Override
    public void onStopWar() {
        LOGGER.info("双方达成了平手");
    }
}
