package com.vetias.java.basics;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your Gender(Male/Female):");
        String gender =input.nextLine();
        System.out.println("Enter yourqualification:");
        String qualification =input.nextLine();
        StringBuilder ob = new StringBuilder();
        if("male".equalsIgnoreCase(gender)) {
            ob.append("Mr. ");
            ob.append(name).append(" ").append(qualification);
            String result = ob.toString();
            System.out.println(result);
        } else {
            ob.append("Ms. ");
            ob.append(name).append(" ").append(qualification);
            String result = ob.toString();
            System.out.println(result);
        }
    }
        
        


}
