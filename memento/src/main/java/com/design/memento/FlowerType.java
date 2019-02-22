package com.design.memento;

/**
 * 花朵的状态
 */
public enum FlowerType {

    SEED("种子"), BURGEON("发芽"), BUD("花苞"), BLOOM("开放"), DEAD("凋零");

    private String name;

    FlowerType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
