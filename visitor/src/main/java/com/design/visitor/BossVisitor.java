package com.design.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 老板的访问者
 */
public class BossVisitor implements UnitVisitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(BossVisitor.class);

    @Override
    public void visitEngineer(Engineer engineer) {

    }

    @Override
    public void visitBoss(Boss boss) {
        LOGGER.info("你好，{}", boss);
    }

    @Override
    public void visitManager(Manager manager) {

    }
}
