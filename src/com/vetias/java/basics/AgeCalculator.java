package com.vetias.java.basics;
import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the year of birth (yyyy):");
        int yearOfBirth = input.nextInt();
        int PresentYear =LocalDate.now().getYear();
        int CalculatedYear =PresentYear - yearOfBirth;
        System.out.println("Current age :" + CalculatedYear);
        input.close();
    }    

}
