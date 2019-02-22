package com.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 步枪
 */
public class Musket implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Musket.class);

    @Override
    public void shoot() {
        LOGGER.info("步枪开火了(Hash={})", System.identityHashCode(this));
    }
}
