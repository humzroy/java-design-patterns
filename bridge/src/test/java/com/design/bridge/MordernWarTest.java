package com.design.bridge;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

/**
 * 测试现代战争
 */
public class MordernWarTest extends WarTest {

    @Test
    public void testMordernWar() {
        MordernWar war = spy(new MordernWar(mock(IntrepidEnemy.class)));
        testWarEvents(war);
    }
}