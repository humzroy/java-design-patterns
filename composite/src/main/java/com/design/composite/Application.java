package com.design.composite;

/**
 * Composite
 */
public class Application {

    public static void main(String[] args) {
        CharacterComposite chineseComposition = new Writer().sentenceByChinese();
        chineseComposition.print();

        CharacterComposite englishComposition = new Writer().sentenceByEnglish();
        englishComposition.print();
    }
}
