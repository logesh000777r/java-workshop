package com.vetias.java.basics;

public class Total {
    public static void main(String[] args){
        int []marks={1,2,3,4,5,6,7,8};
        int total=0;
        for(int mark:marks){
            System.out.println(mark);
            total+=mark;
        }
        System.out.println("Total="+total);
        
        
    }
    
}
    

