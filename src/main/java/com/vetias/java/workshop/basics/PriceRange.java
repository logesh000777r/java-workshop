package com.vetias.java.workshop.basics;
import java.util.Arrays;
public class PriceRange {
    public static void main(String[] args) {
        int[] prices = {99, 49, 127, 138, 320};

        int min = Arrays.stream(prices).min().getAsInt();
        int max = Arrays.stream(prices).max().getAsInt();

        System.out.println("Lowest price: " + min);
        System.out.println("Highest price: " + max);
    }
}

    

