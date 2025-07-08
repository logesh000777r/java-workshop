package com.vetias.java.basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParseStringAgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Date of birth (dd/mm/yyyy):");
        String dateOfbirth = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfbirth, formatter);
        int yearOfBirth = birthDate.getYear();
        int CurrentYear = LocalDate.now().getYear();
        int CalculatedYear = (CurrentYear - yearOfBirth);

        System.out.println("Current age :" + CalculatedYear);
        input.close();
    }
        

}
