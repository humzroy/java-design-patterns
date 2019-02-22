package com.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 不堪一击的敌人
 */
public class TenderEnemy implements Enemy {

    private static final Logger LOGGER = LoggerFactory.getLogger(TenderEnemy.class);

    @Override
    public void onStartWar() {
        LOGGER.info("敌人士气不足，无奈迎战");
    }

    @Override
    public void onCombatting() {
        LOGGER.info("敌人纷纷溃败");
    }

    @Override
    public void onStopWar() {
        LOGGER.info("敌人不堪一击，只得投降");
    }
}
