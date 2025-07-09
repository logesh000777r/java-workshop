package com.vetias.java.workshop.StandardLibs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBinary {
    public static void main(String[] args){
        try(FileInputStream input= new FileInputStream("pexels-pixabay-235985.jpg");
            FileOutputStream output= new FileOutputStream("outputt.jpg"))
            {
                byte[]chunk = new byte[2048];
                int byteRead;
                while((byteRead=input.read(chunk))!=-1){
                    output.write(chunk,0,byteRead);
                }

        }catch(IOException e){
            System.out.println("Error in Reading or writing The File");
        }
    }

}
