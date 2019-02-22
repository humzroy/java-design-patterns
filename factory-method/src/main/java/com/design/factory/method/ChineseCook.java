package com.design.factory.method;

/**
 * 中餐厨师
 */
public class ChineseCook implements Cook {

    @Override
    public Food cookFood(FoodType foodType) {
        return new ChineseFood(foodType);
    }
}
