package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.BiggestAirplane;

import java.util.List;

public interface BiggestAirplaneDAO {

    public List<BiggestAirplane> findAll();
}
