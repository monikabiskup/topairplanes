package com.topairplanes.springboot.topairplanes.service;

import com.topairplanes.springboot.topairplanes.dao.BiggestAirplaneDAO;
import com.topairplanes.springboot.topairplanes.entity.BiggestAirplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BiggestAirplaneServiceImpl implements BiggestAirplaneService{

    private BiggestAirplaneDAO biggestAirplaneDAO;

    @Autowired
    public BiggestAirplaneServiceImpl(BiggestAirplaneDAO theBiggestAirplaneDAO) {
        this.biggestAirplaneDAO=theBiggestAirplaneDAO;
    }

    @Override
    @Transactional
    public List<BiggestAirplane> findAll() {
        return biggestAirplaneDAO.findAll();
    }
}
