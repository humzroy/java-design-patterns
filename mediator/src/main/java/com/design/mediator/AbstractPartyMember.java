package com.design.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 派对成员抽象类
 */
public abstract class AbstractPartyMember implements PartyMember {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractPartyMember.class);

    private Party party;

    @Override
    public void joinParty(Party party) {
        LOGGER.info("{}加入了派对", this);
        this.party = party;
    }

    @Override
    public void act(Activity activity) {
        if (null != activity) {
            LOGGER.info("{}提议进行{}活动", this, activity);
            party.letAct(this, activity);
        }
    }

    @Override
    public void partyActivity(Activity activity) {
        LOGGER.info("进行派对活动，名称：{}，介绍：{}", activity, activity.getDescription());
    }

    @Override
    public abstract String toString();
}
