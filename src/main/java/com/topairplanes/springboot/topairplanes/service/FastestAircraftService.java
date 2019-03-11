package com.topairplanes.springboot.topairplanes.service;

import com.topairplanes.springboot.topairplanes.entity.FastestAircraft;

import java.util.List;

public interface FastestAircraftService {

    public List<FastestAircraft> findAll();
}
