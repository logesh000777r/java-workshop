package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(98);
        marks.add(99);
        marks.add(90);
        marks.add(80);
        marks.add(78);
        Collections.sort(marks);
        System.out.println("Ascending Order"+marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Descending Order"+marks);

        
        
        
        

   


    }

}
