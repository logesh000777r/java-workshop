package com.vetias.java.workshop.tempdata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String address;
    private String postalCode;
    private String contact;
    private Building[] building;

    public Location(String name, double latitude, double longitude, String address, String postalCode, String contact, Building[] building) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.postalCode = postalCode;
        this.contact = contact;
        this.building = building;
    }

    public Building[] getBuilding() {
        return building;
    }

    public void setBuilding(Building[] building) {
        this.building = building;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getContact() {
        return contact;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
@Override
    public String toString(){
        return "Location { name:" +name+ ",Latitude:" +latitude+ ",Longitude:"
        +longitude+ ",Address:" +address+ ",PostalCode:" +postalCode+ ",Contact:" +contact+ ",BuildingCount:" + (building != null ? building.length : 0) + "}";
    }
}
        this.contact = contact;
    }
    

@Override
    public String toString(){
        return "Location { name:" +name+ ",Latitude:" +latitude+ ",Longitude:"
        +longitude+ ",Address:" +address+ ",PostalCode:" +postalCode+ ",Contact:" +contact+ "}";
    }
}



            


