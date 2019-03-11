package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;

import java.util.List;

public interface BiggestAircraftDAO {

    public List<BiggestAircraft> findAll();
}
