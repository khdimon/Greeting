package com.kholod.testtasks.greeting;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeUtil {

    private final static Logger logger = Logger.getLogger(Greeter.class);

    public static LocalTime getCurrentTime() {

        logger.info("Current time is requested");

        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.toLocalTime();
    }
}
