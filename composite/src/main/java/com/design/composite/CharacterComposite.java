package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 字母组合的抽象类
 */
public abstract class CharacterComposite {

  private List<CharacterComposite> children = new ArrayList<>();

  public void add(CharacterComposite character) {
    children.add(character);
  }

  public int count() {
    return this.children.size();
  }

  public void printBefore() {
  }

  public void printAfter() {
  }

  public void print() {
    printBefore();
    for (CharacterComposite item : children) {
      item.print();
    }
    printAfter();
  }
}
