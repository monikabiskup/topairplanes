package com.topairplanes.springboot.topairplanes.service;

import com.topairplanes.springboot.topairplanes.dao.BiggestAircraftDAO;
import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BiggestAircraftServiceImpl implements BiggestAircraftService {

    private BiggestAircraftDAO biggestAircraftDAO;

    @Autowired
    public BiggestAircraftServiceImpl(BiggestAircraftDAO theBiggestAircraftDAO) {
        this.biggestAircraftDAO = theBiggestAircraftDAO;
    }

    @Override
    @Transactional
    public List<BiggestAircraft> findAll() {
        return biggestAircraftDAO.findAll();
    }
}
