package com.vetias.java.workshop.streams;
import java.util.Arrays;
import java.util.Comparator;


public class MorningHW {
    public static void main(String[] args) {
        Integer[]marks={12,78,89,56,45};
        Arrays.stream(marks).sorted().forEach(System.out::println);
        Arrays.stream(marks).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Arrays.stream(marks).sorted(Comparator.reverseOrder()).forEach(System.out::println);






    }

}
