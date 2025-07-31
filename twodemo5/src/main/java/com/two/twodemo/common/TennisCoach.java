package com.two.twodemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}
