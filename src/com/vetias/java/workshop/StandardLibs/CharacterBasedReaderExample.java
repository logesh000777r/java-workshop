package com.vetias.java.workshop.StandardLibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Throwable;

public class CharacterBasedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("README.md"))) {
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            
        }catch(IOException e){
            System.out.println("File not Found");
            printStackTrace();
        }
    }

    private static void printStackTrace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStackTrace'");
    }

}
