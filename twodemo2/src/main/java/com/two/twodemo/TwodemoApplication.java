package com.two.twodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.two.twodemo",
//							"com.two.util"}
//)
@SpringBootApplication
public class TwodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwodemoApplication.class, args);
	}

}
