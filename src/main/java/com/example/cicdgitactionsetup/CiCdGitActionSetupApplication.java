package com.example.cicdgitactionsetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdGitActionSetupApplication {

    @GetMapping("/")
    String Greet() {
        return "Hello Axel ! \nAre you fine ?";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdGitActionSetupApplication.class, args);
    }

}
