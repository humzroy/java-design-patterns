package com.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 清闲的状态
 */
public class IdleState implements State {

    private static final Logger LOGGER = LoggerFactory.getLogger(IdleState.class);

    private Coder coder;

    public IdleState(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void onPreparing() {
        LOGGER.info("{}正努力使自己变得平静", coder);
    }

    @Override
    public void onEnterState() {
        LOGGER.info("{}正悠闲的听着歌", coder);
    }
}
