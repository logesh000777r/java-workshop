package com.vetias.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> students =new HashMap<>();
        students.put(1006,"Sarvesh");
        students.put(1002,"Sachin");
        students.put(1003,"SachinBabu");
        students.put(1004,"Mithun");
        students.put(1007,"Logesh");
        students.put(1009,"Sarvesh");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        

    }

}
