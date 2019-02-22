package com.design.visitor;

/**
 * 工程师
 */
public class Engineer extends Unit {

    public Engineer(Unit... children) {
        super(children);
    }

    @Override
    public void beVisited(UnitVisitor visitor) {
        visitor.visitEngineer(this);
        super.beVisited(visitor);
    }

    @Override
    public String toString() {
        return "工程师";
    }
}
