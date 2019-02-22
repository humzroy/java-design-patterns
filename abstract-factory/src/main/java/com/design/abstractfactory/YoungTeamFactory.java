package com.design.abstractfactory;

/**
 * 年轻团队工厂
 */
public class YoungTeamFactory implements TeamFactory {

    @Override
    public Ship createShip() {
        return new NewShip();
    }

    @Override
    public Captain createCaptain() {
        return new YoungCaptain();
    }

    @Override
    public Sailor createSailor() {
        return new YoungSailor();
    }
}
