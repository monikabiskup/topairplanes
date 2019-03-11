package com.topairplanes.springboot.topairplanes.controller;

import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;
import com.topairplanes.springboot.topairplanes.entity.FastestAircraft;
import com.topairplanes.springboot.topairplanes.service.BiggestAircraftService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/top5Aircrafts")
public class BiggestAircraftController {

    private BiggestAircraftService biggestAircraftService;

    public BiggestAircraftController(BiggestAircraftService theBiggestAircraftService) {
        biggestAircraftService = theBiggestAircraftService;
    }

    @GetMapping("/theBiggestAircrafts")
    public String listTheBiggestAircrafts(Model theModel) {
        List<BiggestAircraft> theBiggestAircrafts=biggestAircraftService.findAll();
        theModel.addAttribute("biggest_aircrafts", theBiggestAircrafts);
        return "theBiggestAircrafts";
    }

}
