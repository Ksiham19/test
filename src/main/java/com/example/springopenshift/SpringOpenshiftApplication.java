package com.example.springopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {

    @GetMapping("/")
    public String home() {
        return "Hello from OpenShift Sandbox 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenshiftApplication.class, args);
    }
}
