package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;


public class ListExample {
    public static void main(String[] args){
        List<String> names=  new ArrayList<>();
        names.add("Mithun");
        names.add("Sachin");
        names.add("Abullaize");
        names.add("Logesh");
        names.add("locke");
        System.out.println(names);
        // System.out.println(names.set(1,"SACHINBABU"));


        // for(int i=0;i<names.size();i++){
        //     System.out.println(names.get(i));
        // }
        // System.out.println(names.contains("Mithun"));
        // System.out.println(names.reversed());
        names.forEach(System.out::println);

    }

}
  