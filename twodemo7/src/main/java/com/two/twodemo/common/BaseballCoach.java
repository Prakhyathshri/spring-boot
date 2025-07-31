package com.two.twodemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public  BaseballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30min in batting practice";
    }
}
