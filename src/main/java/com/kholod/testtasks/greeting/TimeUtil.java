package com.kholod.testtasks.greeting;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Util class for getting current time
 */
public class TimeUtil {

    private final static Logger logger = Logger.getLogger(Greeter.class);

    /**
     * Returns current time
     *
     * @return current time
     */
    public static LocalTime getCurrentTime() {

        logger.info("Current time is requested");

        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.toLocalTime();
    }
}
