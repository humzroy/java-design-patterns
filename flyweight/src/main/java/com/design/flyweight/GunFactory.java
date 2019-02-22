package com.design.flyweight;

import java.util.EnumMap;
import java.util.Map;

import static com.design.flyweight.GunType.*;

/**
 * 武器工厂
 */
public class GunFactory {

    private Map<GunType, Shooting> gunRepo;

    public GunFactory() {
        gunRepo = new EnumMap<GunType, Shooting>(GunType.class);
    }

    public Shooting createGun(GunType type) {
        Shooting gun = gunRepo.get(type);
        if (null == gun) {
            switch (type) {
                case HANDGUN: {
                    gun = new HandGun();
                    gunRepo.put(HANDGUN, gun);
                    break;
                }
                case MUSKET: {
                    gun = new Musket();
                    gunRepo.put(MUSKET, gun);
                    break;
                }
                case SNIPER: {
                    gun = new Sniper();
                    gunRepo.put(SNIPER, gun);
                    break;
                }
                case SUBMACHINE: {
                    gun = new Submachine();
                    gunRepo.put(SUBMACHINE, gun);
                    break;
                }
            }
        }
        return gun;
    }
}
