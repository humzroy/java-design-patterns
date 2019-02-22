package com.design.composite;

import java.util.List;

/**
 * 词
 */
public class ChineseWord extends CharacterComposite {

  public ChineseWord(List<Character> characters) {
    for (Character c : characters) {
      add(c);
    }
  }

  @Override
  public void printBefore() {
    System.out.print("");
  }
}
