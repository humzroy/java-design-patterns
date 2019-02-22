package com.design.facade;

/**
 * Facade
 */
public class Application {

    public static void main(String[] args) {
        CourseFacade participator = new CourseFacade();
        participator.prepare();
        participator.proceed();
        participator.stop();
    }
}
