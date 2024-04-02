package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current Time: " + LocalDateTime.now();
    }
}