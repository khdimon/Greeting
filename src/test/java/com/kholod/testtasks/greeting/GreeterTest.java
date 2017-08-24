package com.kholod.testtasks.greeting;

import org.junit.Test;

import java.time.LocalTime;
import java.util.Locale;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void getGreetingByTime_Morning_enUS() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("en", "US"));
        LocalTime time = LocalTime.of(6, 0);
        Greeter greeter = new Greeter();
        String expectedMessage = "Good morning, World!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Morning_ruRU() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("ru", "RU"));
        LocalTime time = LocalTime.of(8, 59);
        Greeter greeter = new Greeter();
        String expectedMessage = "Доброе утро, Мир!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Day_enUS() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("en", "US"));
        LocalTime time = LocalTime.of(9, 0);
        Greeter greeter = new Greeter();
        String expectedMessage = "Good day, World!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Day_ruRU() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("ru", "RU"));
        LocalTime time = LocalTime.of(11, 00);
        Greeter greeter = new Greeter();
        String expectedMessage = "Добрый день, Мир!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Evening_enUS() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("en", "US"));
        LocalTime time = LocalTime.of(19, 0);
        Greeter greeter = new Greeter();
        String expectedMessage = "Good evening, World!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Evening_ruRU() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("ru", "RU"));
        LocalTime time = LocalTime.of(22, 59);
        Greeter greeter = new Greeter();
        String expectedMessage = "Добрый вечер, Мир!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Night_enUS() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("en", "US"));
        LocalTime time = LocalTime.of(0, 0);
        Greeter greeter = new Greeter();
        String expectedMessage = "Good night, World!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getGreetingByTime_Night_ruRU() throws Exception {
        //Arrange
        Locale.setDefault(new Locale("ru", "RU"));
        LocalTime time = LocalTime.of(5, 30);
        Greeter greeter = new Greeter();
        String expectedMessage = "Доброй ночи, Мир!";

        //Act
        String actualMessage = greeter.getGreetingByTime(time);

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }
}