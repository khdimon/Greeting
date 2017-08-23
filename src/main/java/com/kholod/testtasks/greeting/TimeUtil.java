package com.kholod.testtasks.greeting;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeUtil {

    public static LocalTime getCurrentTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.toLocalTime();
    }
}
