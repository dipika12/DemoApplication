package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    @GetMapping("/")
    public  String start() {
        return "Hello!!! The time on server is "+ LocalDateTime.now();
    }

}
