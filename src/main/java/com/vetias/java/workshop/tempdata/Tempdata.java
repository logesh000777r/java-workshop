package com.vetias.java.workshop.tempdata;

import java.time.LocalDate;

import com.vetias.java.workshop.tempdata.beans.Organization;

public class Tempdata {
    public static void main(String[] args){
    // String setname = "VET Thindal";
    // double alatitude = 10.123456;
    // double alongitude = 78.123456;
    // String setaddress = "Thindal,Erode,TamilNadu,India";
    // String setpostalCode = "638012";
    // String setcontact = "9843170755";

    // System.out.println("Name:" + setname);
    // System.out.println("Latitude:" + alatitude);
    // System.out.println("Longitude:" + alongitude);
    // System.out.println("Address:" + setaddress);
    // System.out.println("PostalCode:" + setpostalCode);
    // System.out.println("Contact:" + setcontact);
        Organization vet= new Organization("Vellalar Educational Trust","Thindal,Erode","www.vet.com","contactvet.com",
        "9843170755",123345678,LocalDate.of(1960,04,23));
        System.out.println(vet);
        System.out.println(vet.name());
        System.out.println(vet.completeAddress());
        System.out.println(vet.website());
        System.out.println(vet.email());
        System.out.println(vet.contactNumber());
        System.out.println(vet.registration());
        System.out.println(vet.registrationDate());

        
    }

}
