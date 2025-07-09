package com.vetias.java.basics;

import java.util.Arrays;

public class StudentDetails {
    public static void main(String[] args){
        String [][] employees=new String[5][2];
        employees[0][0]="1001";
        employees[0][1]="sam";
        employees[1][0]="1001";
        employees[1][1]="ram";
        for(String []employee:employees){
            System.out.println(Arrays.toString(employee));
        }



    }

}
