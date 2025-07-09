package com.vetias.java.workshop.basics;


public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Divsision: " + calculator.divide(10, 0));
        System.out.println("Addition: " + calculator.add(10, 6));
        System.out.println("Subtraction: " + calculator.subtraction(10, 0));
    }
    public int divide(int a,int b){
        try{
            if(b==0){
                System.out.println("Division by zero Not possible");
                return 0;
            } else {
                return a/b;
            }
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int add(int a,int b){
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }

        

}
