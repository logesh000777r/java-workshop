package com.vetias.java.workshop.basics;
import java.util.Arrays;
 public class AscendingPriceList{

    public static void main(String[] args) {

        int[] prices = {99,49, 127,138,320};
        Arrays.sort(prices); 
        System.out.println("Prices in ascending order:");
        for (int price : prices) {
            System.out.println(price);
        }
    }
}

