package com.vetias.java.workshop.dailyprograms;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces to center each row
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print '*' characters separated by a space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



