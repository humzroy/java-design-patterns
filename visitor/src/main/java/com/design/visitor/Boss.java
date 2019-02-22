package com.design.visitor;

/**
 * 老板
 */
public class Boss extends Unit {

    public Boss(Unit... children) {
        super(children);
    }

    @Override
    public void beVisited(UnitVisitor visitor) {
        visitor.visitBoss(this);
        super.beVisited(visitor);
    }

    @Override
    public String toString() {
        return "老板";
    }
}
