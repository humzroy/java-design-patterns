package com.design.abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 抽象工厂测试类
 */
public class AbstractFactoryTest {

    private Application mApplication;
    private PermanentTeamFactory mPermanentTeamFactory;
    private YoungTeamFactory mYoungTeamFactory;

    @Before
    public void setUp() {
        mApplication = new Application();
        mPermanentTeamFactory = new PermanentTeamFactory();
        mYoungTeamFactory = new YoungTeamFactory();
    }

    @Test
    public void testCreateYoungTeam() {
        mApplication.createTeam(mYoungTeamFactory);
        final Ship ship = mApplication.getmShip();
        final Captain captain = mApplication.getmCaptain();
        final Sailor sailor = mApplication.getmSailor();

        assertTrue(ship instanceof NewShip);
        assertTrue(captain instanceof YoungCaptain);
        assertTrue(sailor instanceof YoungSailor);

        assertEquals(ship.getDescription(), NewShip.DESCRIPTION);
        assertEquals(captain.getDescription(), YoungCaptain.DESCRIPTION);
        assertEquals(sailor.getDescription(), YoungSailor.DESCRIPTION);
    }

    @Test
    public void testApplication() {
        String[] args = {};
        Application.main(args);
    }
}
