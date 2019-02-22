package com.design.state;

/**
 * 程序员
 */
public class Coder {

    private State state;

    public Coder() {
        this.state = new IdleState(this);
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        state.onEnterState();
    }

    public void timePass() {
        if (state.getClass().equals(ImpatientState.class)) {
            changeStateTo(new IdleState(this));
        } else {
            changeStateTo(new ImpatientState(this));
        }
    }

    public void prepare() {
        state.onPreparing();
    }
}
