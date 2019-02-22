package com.design.visitor;

/**
 * 访问者接口
 */
public interface UnitVisitor {

    void visitEngineer(Engineer engineer);

    void visitBoss(Boss boss);

    void visitManager(Manager manager);
}
