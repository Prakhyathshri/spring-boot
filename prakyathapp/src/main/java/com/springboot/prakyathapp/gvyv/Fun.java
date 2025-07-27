package com.springboot.prakyathapp.gvyv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun {

    @GetMapping("/")
    public String hi (){
        return "Hello hhhhhhhh";

    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K! ";
    }


}
