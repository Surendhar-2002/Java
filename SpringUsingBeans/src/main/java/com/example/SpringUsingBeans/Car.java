package com.example.SpringUsingBeans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public void startJourney() {
        System.out.println("Car is running");
    }

}
