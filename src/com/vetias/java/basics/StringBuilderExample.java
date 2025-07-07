package com.vetias.java.basics;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder ob=new StringBuilder();
        ob.append("Java");
        ob.append(" is").append(" ").append("the").append(" ").append("most")
        .append(" ").append("used").append(" ").append("language").append(" ")
        .append("for").append(" ").append("Enterprise").append(" ").append("Applications"); 
        String result = ob.toString();
        System.out.println(result);
    }
        

}
