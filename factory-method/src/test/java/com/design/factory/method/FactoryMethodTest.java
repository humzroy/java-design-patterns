package com.design.factory.method;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 测试工厂方法
 */
public class FactoryMethodTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(FactoryMethodTest.class);

    @Test
    public void testWesternHot() {
        Cook cook = new WesternCook();
        Food food = cook.cookFood(FoodType.HOT);
        verifyFood(food, WesternFood.class, FoodType.HOT);
    }

    @Test
    public void testWesternCold() {
        Cook cook = new WesternCook();
        Food food = cook.cookFood(FoodType.COLD);
        verifyFood(food, WesternFood.class, FoodType.COLD);
    }

    @Test
    public void testChineseHot() {
        Cook cook = new ChineseCook();
        Food food = cook.cookFood(FoodType.HOT);
        verifyFood(food, ChineseFood.class, FoodType.HOT);
    }

    @Test
    public void testChineseCold() {
        Cook cook = new ChineseCook();
        Food food = cook.cookFood(FoodType.COLD);
        verifyFood(food, ChineseFood.class, FoodType.COLD);
    }

    private void verifyFood(Food food, Class<?> clazz, FoodType type) {
        assertTrue("食物必须是" + clazz.getName() + "的子类", clazz.isInstance(food));
        assertEquals("食物必须是" + type.getName(), type, food.getFoodType());
    }
}
