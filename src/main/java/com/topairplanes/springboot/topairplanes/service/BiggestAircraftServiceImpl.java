package com.topairplanes.springboot.topairplanes.service;

import com.topairplanes.springboot.topairplanes.dao.BiggestAircraftRepository;
import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BiggestAircraftServiceImpl implements BiggestAircraftService {

    private BiggestAircraftRepository biggestAircraftRepository;

    @Autowired
    public BiggestAircraftServiceImpl(BiggestAircraftRepository theBiggestAircraftRepository) {
        this.biggestAircraftRepository = theBiggestAircraftRepository;
    }

    @Override
    public List<BiggestAircraft> findAll() {
        return biggestAircraftRepository.findAll();
    }
}
