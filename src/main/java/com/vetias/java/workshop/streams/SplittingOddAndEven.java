package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplittingOddAndEven {
    public static void main(String[] args){
        List<Integer> no = Arrays.asList(1,2,3,4,5,6,7,8);
        Map<Boolean, List<Integer>> oddEvenMap = no.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(oddEvenMap);
    }
    


}
