package com.design.mediator;

/**
 * 派对
 */
public interface Party {

    void addMember(PartyMember member);

    void letAct(PartyMember member, Activity activity);
}
