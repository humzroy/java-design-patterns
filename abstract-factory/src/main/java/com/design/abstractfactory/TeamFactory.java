package com.design.abstractfactory;

/**
 * 团队工厂要实现的功能
 */
public interface TeamFactory {

    Ship createShip();

    Captain createCaptain();

    Sailor createSailor();
}
