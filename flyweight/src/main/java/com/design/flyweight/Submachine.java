package com.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 冲锋枪
 */
public class Submachine implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Submachine.class);

    @Override
    public void shoot() {
        LOGGER.info("冲锋枪开火了(Hash={})", System.identityHashCode(this));
    }
}
