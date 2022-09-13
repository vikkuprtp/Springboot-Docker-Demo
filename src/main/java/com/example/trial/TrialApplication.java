package com.example.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrialApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrialApplication.class, args);
    }

}
