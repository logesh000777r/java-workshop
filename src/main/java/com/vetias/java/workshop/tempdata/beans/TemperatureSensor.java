package com.vetias.java.workshop.tempdata.beans;

public class TemperatureSensor implements Sensor{
    private float temperature;
    public TemperatureSensor(float atemperature){
        temperature=atemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }

}
