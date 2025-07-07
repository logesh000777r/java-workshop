package com.vetias.java.workshop.tempdata.beans;
import java.time.LocalDateTime;

public class Building{
    private String name;
    private String  area;
    private int floors;
    private LocalDateTime openingHours;
    private LocalDateTime closingHours;

    // (Add this constructor to the Building class)
    public Building(String name, String area, int floors, LocalDateTime openingHours, LocalDateTime closingHours) {
    // Initialize fields accordingly
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
    }

    public String getName() {
        return name;
    }
    public String getArea() {
        return area;
    }
    public int getFloors() {
        return floors;
    }
    public LocalDateTime getOpeningHours() {
        return openingHours;
    }
    public LocalDateTime getClosingHours() {
        return closingHours;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setOpeningHours(LocalDateTime openingHours) {
        this.openingHours = openingHours;
    }
    public void setClosingHours(LocalDateTime closingHours) {
        this.closingHours = closingHours;
    }

    public void PrintDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Number of Floors: " + floors);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Closing Hours: " + closingHours);
    }
}
//l