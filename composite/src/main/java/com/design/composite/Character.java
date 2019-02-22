package com.design.composite;

/**
 * 字
 */
public class Character extends CharacterComposite {

    private char c;

    public Character(char c) {
        this.c = c;
    }

    @Override
    public void print() {
        System.out.print(c);
    }
}
