package com.kholod.testtasks.greeting;

import java.time.LocalTime;
import java.util.ResourceBundle;

public class Greeter {

    public static final LocalTime BEGIN_MORNING =
            LocalTime.of(6, 0);
    public static final LocalTime BEGIN_DAY =
            LocalTime.of(9, 0);
    public static final LocalTime BEGIN_EVENING =
            LocalTime.of(19, 0);
    public static final LocalTime BEGIN_NIGHT =
            LocalTime.of(23, 0);

    public String getGreetingByTime(LocalTime currentTime) {
        ResourceBundle RESOURCE_BUNDLE =
                ResourceBundle.getBundle("messages");

        if (currentTime.compareTo(BEGIN_NIGHT) >= 0
                || currentTime.compareTo(BEGIN_MORNING) < 0) {
            return RESOURCE_BUNDLE.getString("greeting.night");
        }
        if (currentTime.compareTo(BEGIN_EVENING) >= 0) {
            return RESOURCE_BUNDLE.getString("greeting.evening");
        }
        if (currentTime.compareTo(BEGIN_DAY) >= 0) {
            return RESOURCE_BUNDLE.getString("greeting.day");
        }
        return RESOURCE_BUNDLE.getString("greeting.morning");
    }
}
