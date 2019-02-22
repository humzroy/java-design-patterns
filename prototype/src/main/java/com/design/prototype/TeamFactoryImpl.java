package com.design.prototype;

/**
 * 团队工厂实现类
 */
public class TeamFactoryImpl implements TeamFactory {

    private Driver driver;
    private Passenger passenger;
    private Vehicle vehicle;

    public TeamFactoryImpl(Driver driver, Passenger passanger, Vehicle vehicle) {
        this.driver = driver;
        this.passenger = passanger;
        this.vehicle = vehicle;
    }

    @Override
    public Driver createDriver() {
        try {
            return driver.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Passenger createPassenger() {
        try {
            return passenger.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Vehicle createVehicle() {
        try {
            return vehicle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
