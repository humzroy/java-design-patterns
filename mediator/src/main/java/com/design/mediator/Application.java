package com.design.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mediator
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Party party = new PartyImpl();
        Student student = new Student();
        Officer officer = new Officer();
        Businessman businessman = new Businessman();
        Oldman oldman = new Oldman();

        party.addMember(student);
        party.addMember(officer);
        party.addMember(businessman);
        party.addMember(oldman);

        student.act(Activity.DESKTOP_GAME);
        officer.act(Activity.GUESS);
        businessman.act(Activity.SHOOT);
        oldman.act(Activity.SING);
    }
}
