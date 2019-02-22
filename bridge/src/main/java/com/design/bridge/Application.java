package com.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bridge
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        War war1 = new AncientWar(new IntrepidEnemy());
        war1.startWar();
        war1.combatting();
        war1.stopWar();
        LOGGER.info("\n");

        War war2 = new AncientWar(new TenderEnemy());
        war2.startWar();
        war2.combatting();
        war2.stopWar();
        LOGGER.info("\n");

        War war3 = new MordernWar(new IntrepidEnemy());
        war3.startWar();
        war3.combatting();
        war3.stopWar();
        LOGGER.info("\n");

        War war4 = new MordernWar(new TenderEnemy());
        war4.startWar();
        war4.combatting();
        war4.stopWar();
    }
}
