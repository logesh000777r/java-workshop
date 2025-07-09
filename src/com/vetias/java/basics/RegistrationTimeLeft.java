package com.vetias.java.basics;
import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime CurrentTime =LocalTime.now();
        LocalTime RegEndTime = LocalTime.of(18,59,59);
        int HoursLeft = RegEndTime.getHour() - CurrentTime.getHour();
        int MinutesLeft = RegEndTime.getMinute() - CurrentTime.getMinute();
        int SecondsLeft = RegEndTime.getSecond() - CurrentTime.getSecond();
        System.out.println("Time you have left to register: " + HoursLeft + " hours, " + MinutesLeft + " minutes, " + SecondsLeft + " seconds");
    }    




}
