package com.design.bridge;

/**
 * 战争
 */
public interface War {

    Enemy getEnemy();

    void startWar();

    void combatting();

    void stopWar();
}
