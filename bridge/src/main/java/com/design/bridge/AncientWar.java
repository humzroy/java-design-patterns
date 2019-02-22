package com.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 古代战争
 */
public class AncientWar implements War {

    private static final Logger LOGGER = LoggerFactory.getLogger(AncientWar.class);

    private final Enemy enemy;

    public AncientWar(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public Enemy getEnemy() {
        return this.enemy;
    }

    @Override
    public void startWar() {
        LOGGER.info("一场古代战争开始了");
        enemy.onStartWar();
    }

    @Override
    public void combatting() {
        LOGGER.info("古代战争正在激烈进行中");
        enemy.onCombatting();
    }

    @Override
    public void stopWar() {
        LOGGER.info("这场古代战争结束了");
        enemy.onStopWar();
    }
}
