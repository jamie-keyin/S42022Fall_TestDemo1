package com.keyin.demo;

public class WordBuilder {
    public String encodeWords(String firstWord, String secondWord) {
        return firstWord + "%20" + secondWord;
    }
}
