package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;
import java.util.Objects;

public class HostelBuilding extends Building {
    private int numberOfRooms;
    private boolean isMessOpen;

    public HostelBuilding(String name, String area, int floors, LocalDateTime openingHours, LocalDateTime closingHours, int numberOfRooms, boolean isMessOpen) {
        super(name, area, floors, openingHours, closingHours); // Pass required arguments to Building constructor
        this.numberOfRooms = numberOfRooms;
        this.isMessOpen = isMessOpen;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isMessOpen() {
        return isMessOpen;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setMessOpen(boolean messOpen) {
        isMessOpen = messOpen;
    }
    public void displayHostelInfo() {
        super.PrintDetails();
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Is Mess Open: " + (isMessOpen ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "HostelBuilding{" +
                "numberOfRooms=" + numberOfRooms +
                ", isMessOpen=" + isMessOpen +
                ", " + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {   
        if (this == o) return true;
        if (!super.equals(o)) return false;

        HostelBuilding that = (HostelBuilding) o;

        if (numberOfRooms != that.numberOfRooms) return false;
        return isMessOpen == that.isMessOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRooms, isMessOpen, super.hashCode());
    }
}


