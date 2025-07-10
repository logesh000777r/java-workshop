package com.vetias.java.workshop.collections;
import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> rollNos =new HashSet<>();
        rollNos.add(1001);
        rollNos.add(1021);
        rollNos.add(1401);
        rollNos.add(1021);
        rollNos.add(1031);
        System.out.println(rollNos);
    }

}
