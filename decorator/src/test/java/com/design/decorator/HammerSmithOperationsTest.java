package com.design.decorator;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * 测试铁匠的操作
 */
public class HammerSmithOperationsTest {

    @Test
    public void testOperations() throws Exception {
        final Operation carpenter = spy(new CarpenterOperation());
        final Operation hammerSmith = new HammerSmithOperation(carpenter);

        hammerSmith.checkBefore();
        verify(carpenter, times(1)).checkBefore();

        hammerSmith.join();
        verify(carpenter, times(1)).join();

        hammerSmith.chekcAfter();
        verify(carpenter, times(1)).chekcAfter();
    }
}