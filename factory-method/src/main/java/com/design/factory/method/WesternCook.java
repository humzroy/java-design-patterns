package com.design.factory.method;

/**
 * 西餐厨师
 */
public class WesternCook implements Cook {

    @Override
    public Food cookFood(FoodType foodType) {
        return new WesternFood(foodType);
    }
}
