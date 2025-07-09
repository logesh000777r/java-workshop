package com.vetias.java.workshop.basics;
import java.util.Scanner;
public class RemovingAbsentStudents {
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

        System.out.print("\nEnter roll number of absent student: ");
        int absentRoll = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (rolls[i] == absentRoll) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = idx; i < n - 1; i++) {
                rolls[i] = rolls[i + 1];
                names[i] = names[i + 1];
            }
            n--; 
            System.out.println("\nStudent removed.");
        } else {
            System.out.println("No such student with roll number " + absentRoll);
        }

        System.out.println("\nUpdated Student List:");
        System.out.println("Roll\tName");
        for (int i = 0; i < n; i++) {
            System.out.println(rolls[i] + "\t" + names[i]);
        }

        sc.close();
    }
}

    

