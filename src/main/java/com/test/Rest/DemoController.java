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

}
