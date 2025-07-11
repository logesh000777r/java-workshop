package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class CapitalizeNames {
    public static void main(String[] args){
        List<String> names=  new ArrayList<>();
        names.add("Mithun");
        names.add("Sachin");
        names.add("Abullaize");
        names.add("Logesh");
        names.add("Mithun");
        names.add("locke");
        System.out.println(names);
        names.stream().filter(name->name.startsWith("S")||name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);

    }

}
