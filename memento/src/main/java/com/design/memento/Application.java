package com.design.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * Memento
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Stack<Plant> stack = new Stack<>();

        Flower flower = new Flower(FlowerType.SEED, "水仙花", 1, 2);
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());
        flower.growing();
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());
        flower.growing();
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());
        flower.growing();
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());
        flower.growing();
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());
        flower.growing();
        stack.add(flower.getMemento());
        LOGGER.info(flower.toString());

        while (stack.size() > 0) {
            flower.setMemento(stack.pop());
            LOGGER.info(flower.toString());
        }
    }
}
