package com.design.state;

/**
 * State
 */
public class Application {

    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.prepare();
        coder.timePass();
        coder.prepare();
        coder.timePass();
        coder.prepare();
    }
}
