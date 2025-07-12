package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;
import java.util.Map;

public class TemperatureSensor implements Sensor{
    private float temperature;
    public TemperatureSensor(float atemperature){
        temperature=atemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }
    @Override
    public Map<LocalDateTime, Float> getTemperatureReadings() {
        throw new UnsupportedOperationException("Unimplemented method 'getTemperatureReadings'");
    }
    @Override
    public void addReading(LocalDateTime time, float temperature) {
        throw new UnsupportedOperationException("Unimplemented method 'addReading'");
    }

}
