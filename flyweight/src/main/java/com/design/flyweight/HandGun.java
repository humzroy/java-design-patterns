package com.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 手枪
 */
public class HandGun implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandGun.class);

    @Override
    public void shoot() {
        LOGGER.info("手枪开火了(Hash={})", System.identityHashCode(this));
    }
}
