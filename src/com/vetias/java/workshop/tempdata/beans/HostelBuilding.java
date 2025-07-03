package com.vetias.java.workshop.tempdata.beans;

public class HostelBuilding extends Building {
    private  boolean isMessAvailable;
    private int numberofrooms;


}
@Override
public void printDetails(){
    super.printDetails();
    System.out.println("Mess Available:"+isMessAvailable);
    System.out.println("Number of rooms Available:"+numberofrooms);

}

