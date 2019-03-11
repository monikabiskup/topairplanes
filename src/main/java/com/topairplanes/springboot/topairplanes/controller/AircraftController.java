package com.topairplanes.springboot.topairplanes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/top5Aircrafts")
public class AircraftController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "welcome";
    }

    @GetMapping("/suggestions")
    public String getSuggestions() {
        return "suggestions";
    }
}
