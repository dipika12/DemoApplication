package com.test.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    @Value("${application.greeting}")
    private String greeting;

    @GetMapping("/")
    public  String start() {
        return greeting + "!!! The time on server is "+ LocalDateTime.now();
    }

    @GetMapping("/EveningGreeting")
    public  String eveningGreeting() {
        return greeting + " Good Evening!!! The time on server is "+ LocalDateTime.now();
    }

    @GetMapping("/morningGreeting")
    public  String morningGreeting() {
        return greeting + " Good Morning!!! The time on server is "+ LocalDateTime.now();
    }

    @GetMapping("/greet")
    public  String afternoonGreeting() {
        return greeting + " Good Afternoon!!! The time on server is "+ LocalDateTime.now();
    }
}
