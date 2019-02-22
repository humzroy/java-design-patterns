package com.design.bridge;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

/**
 * 测试古代战争
 */
public class AncientWarTest extends WarTest {

    @Test
    public void testAncientWar() {
        final AncientWar war = spy(new AncientWar(mock(IntrepidEnemy.class)));
        testWarEvents(war);
    }
}
