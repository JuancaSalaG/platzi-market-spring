package com.platzi.platzi_market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/world")
    public String hello() {
        return "Hello World from Platzi Market";
    }
}
