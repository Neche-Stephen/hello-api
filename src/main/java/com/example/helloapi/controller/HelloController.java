package com.example.helloapi.controller;

import com.example.helloapi.model.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public GreetingResponse hello(@RequestParam(name = "visitor_name", defaultValue = "Mark") String visitorName) {
        String clientIp = "127.0.0.1"; // The IP address of the requester
        String location = "New York"; // The city of the requester
        String greeting = String.format("Hello, %s! The temperature is 11 degrees Celsius in %s", visitorName, location);

        return new GreetingResponse(clientIp, location, greeting);
    }
}
