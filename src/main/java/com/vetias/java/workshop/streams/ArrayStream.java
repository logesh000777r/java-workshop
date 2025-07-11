package com.vetias.java.workshop.streams;

// import com.vetias.java.workshop.collections.Arrays;
import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {35, 42, 67, 29, 55}; // Example marks array
        long passedMarks = Arrays.stream(marks).filter(mark -> mark > 40).count();
        System.out.println(passedMarks);

    }

}
