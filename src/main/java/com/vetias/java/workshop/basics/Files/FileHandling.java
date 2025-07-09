package com.vetias.java.workshop.basics.Files;
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("src");
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        }else {
            System.out.println("File does not exist.");
        }
        if(file.isDirectory()) {
            System.out.println("It is a directory.");
            File[] files =file.listFiles();
            if(files != null) {
                for(File f : files) {
                    System.out.println("File: " + f.getName());
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("It is not a directory.");
        }
        if(file.isFile()) {
            System.out.println("It is a file.");
        } else {
            System.out.println("It is not a file.");
        }
    }
}
