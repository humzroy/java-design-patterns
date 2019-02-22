package com.design.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory Method
 */
public class Application {

    private final Cook cook;

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    private Application(Cook cook) {
        this.cook = cook;
    }

    public static void main(String[] args) {
        Application app = new Application(new WesternCook());
        app.makeFood();
        app = new Application(new ChineseCook());
        app.makeFood();
    }

    private void makeFood() {
        Food food;
        food = cook.cookFood(FoodType.COLD);
        LOGGER.info(food.toString());
        food = cook.cookFood(FoodType.HOT);
        LOGGER.info(food.toString());
    }
}
