package com.vetias.java.workshop.basics;

import java.util.StringTokenizer;

public class NewSplitIntoMultipleStrings {
    public static void main(String[] args) {
        String text ="This program shows how can we split a string into multiple strings. We need to find sentence word and letter count in a string.";
        StringTokenizer sentencetokenizer = new StringTokenizer(text, ".");
        StringTokenizer wordtokenizer = new StringTokenizer(text, " ");
        System.out.println("Sentences Count: " + sentencetokenizer.countTokens());
        System.out.println("Words Count: " + wordtokenizer.countTokens());
        System.out.println("Letters Count: " + text.length());
    }

}
