package com.kholod.testtasks.greeting;

import java.time.LocalTime;

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
        if (currentTime.compareTo(BEGIN_NIGHT) >= 0
                || currentTime.compareTo(BEGIN_MORNING) < 0) {
            return "Good night, World!";
        }
        if (currentTime.compareTo(BEGIN_EVENING) >= 0) {
            return "Good evening, World!";
        }
        if (currentTime.compareTo(BEGIN_DAY) >= 0) {
            return "Good day, World!";
        }
        return "Good morning, World!";
    }
}
