package com.design.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工程师的访问者
 */
public class EngineerVisitor implements UnitVisitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(EngineerVisitor.class);

    @Override
    public void visitEngineer(Engineer engineer) {
        LOGGER.info("你好，{}", engineer);
    }

    @Override
    public void visitBoss(Boss boss) {

    }

    @Override
    public void visitManager(Manager manager) {

    }
}
