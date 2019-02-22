package com.design.prototype;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

/**
 * 测试团队工厂
 */
public class FactoryTest {

    @Test
    public void testFactory() throws Exception {
        final Driver driver = mock(Driver.class);
        final Passenger passenger = mock(Passenger.class);
        final Vehicle vehicle = mock(Vehicle.class);

        when(driver.clone()).thenThrow(CloneNotSupportedException.class);
        when(passenger.clone()).thenThrow(CloneNotSupportedException.class);
        when(vehicle.clone()).thenThrow(CloneNotSupportedException.class);

        final TeamFactoryImpl factory = new TeamFactoryImpl(driver, passenger, vehicle);
        assertNull(factory.createDriver());
        assertNull(factory.createPassenger());
        assertNull(factory.createVehicle());

        verify(driver).clone();
        verify(passenger).clone();
        verify(vehicle).clone();
        verifyNoMoreInteractions(driver, passenger, vehicle);
    }
}
