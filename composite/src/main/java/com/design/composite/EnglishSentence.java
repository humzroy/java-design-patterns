package com.design.composite;

import java.util.List;

/**
 * 句子
 */
public class EnglishSentence extends CharacterComposite {

  public EnglishSentence(List<EnglishWord> words) {
    for (EnglishWord word : words) {
      add(word);
    }
  }

  @Override
  public void printAfter() {
    System.out.println(".");
  }
}
