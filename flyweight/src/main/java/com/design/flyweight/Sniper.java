package com.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 狙击枪
 */
public class Sniper implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sniper.class);

    @Override
    public void shoot() {
        LOGGER.info("狙击枪开火了(Hash={})", System.identityHashCode(this));
    }
}
