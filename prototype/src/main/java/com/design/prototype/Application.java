package com.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Prototype
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Driver driver;
        Passenger passenger;
        Vehicle vehicle;
        TeamFactory factory;

        factory = new TeamFactoryImpl(new EstateDriver(), new EstatePassanger(), new EstateVehicle());
        driver = factory.createDriver();
        passenger = factory.createPassenger();
        vehicle = factory.createVehicle();
        LOGGER.info(">> 开始生产旅行车组合");
        LOGGER.info(driver.toString());
        LOGGER.info(passenger.toString());
        LOGGER.info(vehicle.toString());

        factory = new TeamFactoryImpl(new OffRoadDriver(), new OffRoadPassanger(), new OffRoadVehicle());
        driver = factory.createDriver();
        passenger = factory.createPassenger();
        vehicle = factory.createVehicle();
        LOGGER.info(">> 开始生产越野车组合");
        LOGGER.info(driver.toString());
        LOGGER.info(passenger.toString());
        LOGGER.info(vehicle.toString());
    }
}
