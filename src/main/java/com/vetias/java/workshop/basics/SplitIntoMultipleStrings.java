package com.vetias.java.workshop.basics;

public class SplitIntoMultipleStrings {
    public static void main(String[] args) {
        String sentence ="This program shows how can we split a string into multiple strings. We need to find sentence word and letter count in a string.";
        String[] words = sentence.split(" ");
        String[] sentences = sentence.split("\\.");
        String[] letters = sentence.split("");
        System.out.println("Words Count: " + words.length);
        System.out.println("Sentences Count: " + sentences.length);
        System.out.println("Letters Count: " + letters.length);       
    }
}