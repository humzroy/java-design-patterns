package com.design.composite;

import java.util.List;

/**
 * 句子
 */
public class ChineseSentence extends CharacterComposite {

  public ChineseSentence(List<ChineseWord> words) {
    for (ChineseWord word : words) {
      add(word);
    }
  }

  @Override
  public void printAfter() {
    System.out.println("。");
  }
}
