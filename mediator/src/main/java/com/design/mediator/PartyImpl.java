package com.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 派对的实现类
 */
public class PartyImpl implements Party {

    private List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void letAct(PartyMember member, Activity activity) {
        for (PartyMember m : members) {
            if (!member.equals(m)) {
                m.partyActivity(activity);
            }
        }
    }
}
