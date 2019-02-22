package com.design.visitor;

/**
 * 经理
 */
public class Manager extends Unit {

    public Manager(Unit... children) {
        super(children);
    }

    @Override
    public void beVisited(UnitVisitor visitor) {
        visitor.visitManager(this);
        super.beVisited(visitor);
    }

    @Override
    public String toString() {
        return "经理";
    }
}
