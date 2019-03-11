package com.topairplanes.springboot.topairplanes.service;

import com.topairplanes.springboot.topairplanes.dao.FastestAircraftRepository;
import com.topairplanes.springboot.topairplanes.entity.FastestAircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FastestAircraftServiceImpl implements FastestAircraftService {

    public FastestAircraftRepository fastestAircraftRepository;

    @Autowired
    public FastestAircraftServiceImpl(FastestAircraftRepository theFastestAircraftRepository) {
        this.fastestAircraftRepository=theFastestAircraftRepository;
    }

    @Override
    public List<FastestAircraft> findAll() {
        return fastestAircraftRepository.findAll();
    }
}
