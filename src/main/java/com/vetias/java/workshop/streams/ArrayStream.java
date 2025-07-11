package com.vetias.java.workshop.streams;

import com.vetias.java.workshop.collections.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks ={56,67,78,89,90,23};
        long passedMarks = Arrays.stream(marks).filter(mark-> mark>40).count();
        System.out.println(passedMarks);

    }

}
