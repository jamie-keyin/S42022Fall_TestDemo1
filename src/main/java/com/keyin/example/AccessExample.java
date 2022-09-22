package com.keyin.example;

import com.keyin.demo.WordBuilder;

public class AccessExample {
    private WordBuilder encoder = new WordBuilder();

    public AccessExample() {
    }

    public AccessExample(WordBuilder wordBuilder) {
        this.encoder = wordBuilder;
    }

    public String testEncoding(String firstWord, String secondWord) {
        return encoder.encodeWords(firstWord,secondWord);
    }

    public WordBuilder getEncoder() {
        return encoder;
    }

    public void setEncoder(WordBuilder encoder) {
        this.encoder = encoder;
    }
}
