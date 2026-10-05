package a08ClassesUtilitarias.localex;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Time {
    
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(timeNow.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
    }
}
