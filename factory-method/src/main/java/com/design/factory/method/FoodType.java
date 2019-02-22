package com.design.factory.method;

/**
 * 食物类型
 */
public enum FoodType {

    HOT("热的"), COLD("凉的");

    private String name;

    FoodType(String foodType) {
        this.name = foodType;
    }

    public String getName() {
        return name;
    }
}
