package com.design.bridge;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * 测试桥接模式
 */
public abstract class WarTest {

    protected final void testWarEvents(final War war) {
        assertNotNull(war);
        Enemy enemy = war.getEnemy();
        assertNotNull(enemy);
        assertNotNull(war.getEnemy());

        war.startWar();
        verify(enemy).onStartWar();
        verifyNoMoreInteractions(enemy);

        war.combatting();
        verify(enemy).onCombatting();
        verifyNoMoreInteractions(enemy);

        war.stopWar();
        verify(enemy).onStopWar();
        verifyNoMoreInteractions(enemy);
    }
}
