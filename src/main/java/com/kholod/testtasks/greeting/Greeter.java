package com.kholod.testtasks.greeting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;;

/**
 * Class that allows to take true greeting
 */
public class Greeter {

    private final static Logger logger = Logger.getLogger(Greeter.class);

    /**
     * Time that the morning begins from
     */
    public static final LocalTime BEGIN_MORNING =
            LocalTime.of(6, 0);

    /**
     * Time that the day begins from
     */
    public static final LocalTime BEGIN_DAY =
            LocalTime.of(9, 0);

    /**
     * Time that the evening begins from
     */
    public static final LocalTime BEGIN_EVENING =
            LocalTime.of(19, 0);

    /**
     * Time that the night begins from
     */
    public static final LocalTime BEGIN_NIGHT =
            LocalTime.of(23, 0);

    /**
     * Returns greeting that depends on the given times of day and default locale
     *
     * @param time the given time
     * @return string with greeting
     */
    public String getGreetingByTime(LocalTime time) {

        logger.info("Greeting for time "
                + time.format(DateTimeFormatter.ofPattern("HH:mm"))
                + " is requested");

        ResourceBundle RESOURCE_BUNDLE =
                ResourceBundle.getBundle("messages");

        if (time.isBefore(BEGIN_MORNING) || time.isAfter(BEGIN_NIGHT)
                || time.equals(BEGIN_NIGHT)) {
            return RESOURCE_BUNDLE.getString("greeting.night");
        }
        if (time.isBefore(BEGIN_DAY)) {
            return RESOURCE_BUNDLE.getString("greeting.morning");
        }
        if (time.isBefore(BEGIN_EVENING)) {
            return RESOURCE_BUNDLE.getString("greeting.day");
        }
        return RESOURCE_BUNDLE.getString("greeting.evening");
    }
}
