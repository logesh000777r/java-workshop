package com.vetias.java.basics;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();  

        int[] rolls = new int[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rolls[i] = sc.nextInt();
            sc.nextLine();  
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nStudent List:");
        System.out.println("Roll\tName");
        for (int i = 0; i < n; i++) {
            System.out.println(rolls[i] + "\t" + names[i]);
        }

        sc.close();
    }
}

    

