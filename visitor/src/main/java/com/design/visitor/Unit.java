package com.design.visitor;

/**
 * 可访问的单元
 */
public abstract class Unit {

    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    /**
     * 接受访问
     */
    public void beVisited(UnitVisitor visitor) {
        for (Unit childUnit : children) {
            childUnit.beVisited(visitor);
        }
    }
}
