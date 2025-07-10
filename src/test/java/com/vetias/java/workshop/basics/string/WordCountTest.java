package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class WordCountTest {
    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This program shows how many words are in the given string has");
        Assertions.assertEquals(12,count);
    }

    @Test
    public void testAnotherString() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This program shows how many words ");
        Assertions.assertEquals(6,count);
    }


    
}