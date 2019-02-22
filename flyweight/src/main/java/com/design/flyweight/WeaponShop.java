package com.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.design.flyweight.GunType.*;

/**
 * 武器商店
 */
public class WeaponShop {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponShop.class);

    private List<Shooting> shelfA;
    private List<Shooting> shelfB;

    public WeaponShop() {
        shelfA = new ArrayList<>();
        shelfB = new ArrayList<>();
        fillShelves();
    }

    private void fillShelves() {
        GunFactory factory = new GunFactory();

        shelfA.add(factory.createGun(HANDGUN));
        shelfA.add(factory.createGun(HANDGUN));
        shelfA.add(factory.createGun(MUSKET));
        shelfA.add(factory.createGun(MUSKET));
        shelfA.add(factory.createGun(SNIPER));
        shelfA.add(factory.createGun(SNIPER));
        shelfA.add(factory.createGun(MUSKET));
        shelfA.add(factory.createGun(HANDGUN));

        shelfB.add(factory.createGun(SUBMACHINE));
        shelfB.add(factory.createGun(SUBMACHINE));
        shelfB.add(factory.createGun(SUBMACHINE));
        shelfB.add(factory.createGun(SNIPER));
    }

    public final List<Shooting> getGunsOnShelfA() {
        return Collections.unmodifiableList(shelfA);
    }

    public final List<Shooting> getGunOnShelfB() {
        return Collections.unmodifiableList(shelfB);
    }

    public void enumrateShelves() {
        enumerateShelfA();
        enumerateShelfB();
    }

    private void enumerateShelfA() {
        LOGGER.info("从A货架上拿走所有武器");
        for (Shooting gun : shelfA) {
            gun.shoot();
        }
    }

    private void enumerateShelfB() {
        LOGGER.info("从B货架上拿走所有武器");
        for (Shooting gun : shelfB) {
            gun.shoot();
        }
    }
}