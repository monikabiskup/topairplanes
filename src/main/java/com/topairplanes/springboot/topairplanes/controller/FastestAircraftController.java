package com.topairplanes.springboot.topairplanes.controller;

import com.topairplanes.springboot.topairplanes.entity.FastestAircraft;
import com.topairplanes.springboot.topairplanes.service.FastestAircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/top5Aircrafts")
public class FastestAircraftController {

    private FastestAircraftService fastestAircraftService;

    @Autowired
    public FastestAircraftController(FastestAircraftService theFastestAircraftService) {
        this.fastestAircraftService=theFastestAircraftService;
    }
    @GetMapping("/theFastestAircrafts")
    public String listTheFastestAircrafts(Model theModel) {
        List<FastestAircraft> theFastestAircrafts=fastestAircraftService.findAll();
        theModel.addAttribute("fastest_aircrafts", theFastestAircrafts);
        return "theFastestAircrafts";
    }


}
