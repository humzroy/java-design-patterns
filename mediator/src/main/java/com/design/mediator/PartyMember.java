package com.design.mediator;

/**
 * 派对成员
 */
public interface PartyMember {

    void joinParty(Party party);

    void partyActivity(Activity activity);

    void act(Activity activity);
}
