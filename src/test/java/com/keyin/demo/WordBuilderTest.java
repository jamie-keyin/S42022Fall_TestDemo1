package com.keyin.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordBuilderTest {

    @Test
    public void testEncodeWords() {
        WordBuilder wordBuilderUnderTest = new WordBuilder();

        String encodedWord = wordBuilderUnderTest.encodeWords("first", "second");

        System.out.println("Result: " + encodedWord);

        Assertions.assertTrue(encodedWord.contains("%20"));
    }
}
