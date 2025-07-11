package com.vetias.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWithSCount {
    public static void main(String[] args){
        List<String> names=  new ArrayList<>();
        names.add("Mithun");
        names.add("Sachin");
        names.add("Abullaize");
        names.add("Logesh");
        names.add("Mithun");
        names.add("locke");
        System.out.println(names);
        long nameCount= names.stream().filter(name->name.startsWith("M")).distinct().count();
        System.out.println(nameCount);
    }

}
