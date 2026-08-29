package com.cognify.Entities;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class celsiusEntity {

    public float Number;

    public float getNumber() {
        return Number;
    }

    public void setNumber(float number) {
        Number = number;
    }

    @PostConstruct
     public void show(){
         System.out.println(getNumber());
     }
}
