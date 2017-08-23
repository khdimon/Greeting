package com.kholod.testtasks.greeting;

import org.apache.log4j.Logger;

public class App {

    private final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("The application is running");

        Greeter greeter = new Greeter();
        String greeting = greeter.getGreetingByTime(TimeUtil.getCurrentTime());
        System.out.println(greeting);
    }
}
