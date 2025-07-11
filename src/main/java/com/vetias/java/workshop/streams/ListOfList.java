package com.vetias.java.workshop.streams;

import java.util.List;

import java.util.Arrays;

public class ListOfList {
    public static void main(String[] args) {
        List<Integer> csRollno=Arrays.asList(1001,1003,1005,1007);
        List<Integer> aiRollno=Arrays.asList(1002,1004,1006,1008);
        List<Integer> allRollnos=java.util.stream.Stream.concat(csRollno.stream(), aiRollno.stream()).sorted().toList();
        System.out.println(allRollnos);
       





        

    }


}
