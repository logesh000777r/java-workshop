package com.vetias.java.workshop.tempdata.beans;

public class AcademicBuilding {
    private boolean isLibraryAvailable;
    private boolean isAuditoriumAvailable;

}
@Override
public void printDetails(){
    super.printDetails();
    System.out.println("Library Available:"+isLibraryAvailable);
    System.out.println("Auditorium Available:"+isAuditoriumAvailable);

}

