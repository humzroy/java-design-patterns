package com.design.strategy;

/**
 * Strategy
 */
public class Application {

    public static void main(String[] args) {
        BusinessMan man = new BusinessMan(new TransportationAirplane());
        man.transport();

        man.changetStrategy(new TransportationTrain());
        man.transport();

        man.changetStrategy(new TransportationVehicle());
        man.transport();
    }
}
