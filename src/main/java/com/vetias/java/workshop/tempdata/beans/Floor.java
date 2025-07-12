package com.vetias.java.workshop.tempdata.beans;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Floor{
    private int floorName;
    private double number;
    private Set<Zone> zones;

    public Floor(int floorName, double number) {
        this.floorName = floorName;
        this.number = number;
        this.zones = zones!=null
                     ? new HashSet<>(zones)
                     : new HashSet<>();
    }

    public Set<Zone> getZones() {
        return zones;
    }

    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }


    public int getFloorName() {
        return floorName;
    }

    public double getNumber() {
        return number;
    }

    public void setFloorName(int floorName) {
        this.floorName = floorName;
    }



    public void setNumber(double number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Floor{" +
                "floorName=" + floorName +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

    Floor floor = (Floor) o;
    return floorName == floor.floorName &&
            Double.compare(floor.number, number) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(floorName, number);
    }
}

