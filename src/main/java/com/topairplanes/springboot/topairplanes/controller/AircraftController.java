package com.topairplanes.springboot.topairplanes.controller;

import com.topairplanes.springboot.topairplanes.service.BiggestAircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/top5Aircrafts")
public class AircraftController {

    private BiggestAircraftService biggestAircraftService;

    @Autowired
    public AircraftController(BiggestAircraftService theBiggestAircraftService) {
        biggestAircraftService = theBiggestAircraftService;
    }

    @GetMapping("/")
    public String sayHello() {
        return "welcome";
    }

    @GetMapping("/theFastestAircrafts")
    public String listTheFastestAircrafts() {
        return "theFastestAircrafts";
    }

    @GetMapping("/theBiggestAircrafts")
    public String listTheBiggestAircrafts() {
        return "theBiggestAircrafts";
    }

    @GetMapping("/suggestions")
    public String getSuggestions() {
        return "suggestions";
    }
}
