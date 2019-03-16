package com.endava.saconf2019e1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Saconf2019E1Application {

	public static void main(String[] args) {
		SpringApplication.run(Saconf2019E1Application.class, args);
	}

	@GetMapping("/hello")
    public String hello() {
	    return "Hello";
    }
}
