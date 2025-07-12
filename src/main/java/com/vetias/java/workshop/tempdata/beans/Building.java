package com.vetias.java.workshop.tempdata.beans;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.TreeSet;

public class Building{
    private String name;
    private String  area;
    private int floors;
    private LocalDateTime openingHours;
    private LocalDateTime closingHours;
    private TreeSet<Floor> floorsList;  // changed

    public Building(String name, String area, int floors,
                    LocalDateTime openingHours, LocalDateTime closingHours,
                    Collection<Floor> initialFloors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.floorsList = (initialFloors != null)
            ? new TreeSet<>(initialFloors)
            : new TreeSet<>();
    }
    

    public TreeSet<Floor> getFloorsList() {
        return floorsList;
    }

    public void setFloorsList(TreeSet<Floor> floorsList) {
        this.floorsList = floorsList;
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