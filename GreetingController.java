package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
    @PostMapping("/farewell")
    String farewell(@RequestBody String request){
        return "goodbye " +request;
    }
}



