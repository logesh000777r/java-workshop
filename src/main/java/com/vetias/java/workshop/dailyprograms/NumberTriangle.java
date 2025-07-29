package com.vetias.java.workshop.dailyprograms;

    import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

    
        for (int i = 1; i <= rows; i++) {
            int current = 1;
            // inner loop: print i numbers on this row
            for (int j = 1; j <= i; j++) {
                System.out.print(current + " ");
                current++;              
        
            }
    
            System.out.println();
        }
    }
}



