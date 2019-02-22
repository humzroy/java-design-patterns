package com.design.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 经理的访问者
 */
public class ManagerVisitor implements UnitVisitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerVisitor.class);

    @Override
    public void visitEngineer(Engineer engineer) {

    }

    @Override
    public void visitBoss(Boss boss) {

    }

    @Override
    public void visitManager(Manager manager) {
        LOGGER.info("你好，{}", manager);
    }
}
