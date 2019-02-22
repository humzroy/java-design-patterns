package com.design.abstractfactory;

/**
 * 久经考验的团队
 */
public class PermanentTeamFactory implements TeamFactory {

    @Override
    public Ship createShip() {
        return new OldShip();
    }

    @Override
    public Captain createCaptain() {
        return new OldCaptain();
    }

    @Override
    public Sailor createSailor() {
        return new OldSailor();
    }
}
