package com.topairplanes.springboot.topairplanes.rest;

import com.topairplanes.springboot.topairplanes.entity.BiggestAirplane;
import com.topairplanes.springboot.topairplanes.service.BiggestAirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topairplanes")
public class BiggestAirplaneRestController {

    private BiggestAirplaneService biggestAirplaneService;

    @Autowired
    public BiggestAirplaneRestController(BiggestAirplaneService theBiggestAirplaneService) {
        biggestAirplaneService=theBiggestAirplaneService;
    }

    @GetMapping("/biggestAirplanes")
    public List<BiggestAirplane> findAll() {
        return biggestAirplaneService.findAll();
    }



}
