package com.design.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * 测试原型模式
 */
@RunWith(Parameterized.class)
public class PrototypeTest<P extends Prototype> {

    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(
                new Object[]{new EstateDriver(), "这是一名旅行车司机"},
                new Object[]{new EstateVehicle(), "这是一辆旅行车"},
                new Object[]{new EstatePassanger(), "这是一名旅行车乘客"},
                new Object[]{new OffRoadDriver(), "这是一名越野车司机"},
                new Object[]{new OffRoadVehicle(), "这是一辆越野车"},
                new Object[]{new OffRoadPassanger(), "这是一名越野车乘客"}
        );
    }

    private final P prototype;

    private final String expectedString;

    public PrototypeTest(P prototype, String expectedString) {
        this.prototype = prototype;
        this.expectedString = expectedString;
    }

    @Test
    public void testPrototype() throws Exception {
        assertEquals(this.prototype.toString(), this.expectedString);
        final Object clone = this.prototype.clone();
        assertNotNull(clone);
        assertSame(clone.getClass(), this.prototype.getClass());
        assertNotSame(this.prototype, clone);
    }
}
