package com.kholod.testtasks.greeting;

import java.util.Locale;

public class App {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String greeting = greeter.getGreetingByTime(TimeUtil.getCurrentTime());
        System.out.println(greeting);
    }
}
