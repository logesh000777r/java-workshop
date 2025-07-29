package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String name,String website,
String email,String contactNumber,long registration,String description,LocalDate registrationDate) {

    

}
