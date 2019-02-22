package com.design.composite;

import java.util.List;

/**
 * 词
 */
public class EnglishWord extends CharacterComposite {

  public EnglishWord(List<Character> characters) {
    for (Character c : characters) {
      add(c);
    }
  }

  @Override
  public void printBefore() {
    System.out.print(" ");
  }
}
