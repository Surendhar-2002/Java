package com.example.SpringUsingBeans;

import org.springframework.stereotype.Component;

@Component
public class Driver {

    public void drive() {
        System.out.println("Driver is driving the car");
    }

}
