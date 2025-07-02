package com.vetias.java.basics;
import java.util.Arrays;
import java.util.Collections;
public class DescendingPriceList {
    public static void main(String[] args) {

        Integer[] prices = {99,49, 127,138,320};
        Arrays.sort(prices,Collections.reverseOrder()); 
        System.out.println("Prices in Descending order:");
        for (int price : prices) {
            System.out.println(price);
        }
    }
    
}
