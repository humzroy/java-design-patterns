package com.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 焦躁的状态
 */
public class ImpatientState implements State {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImpatientState.class);

    private Coder coder;

    public ImpatientState(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void onPreparing() {
        LOGGER.info("{}面对一堆 bug，开始逐渐焦躁起来", coder);
    }

    @Override
    public void onEnterState() {
        LOGGER.info("{}已经被 bug 搞的进入了极度狂躁的状态", coder);
    }
}
