package com.springboot.prakyathapp.gvyv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun {

    //inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + "Team Name: " + teamName;
    }

    @GetMapping("/")
    public String hi (){
        return "Hello hhhhhhhh";

    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K! ";
    }


}
