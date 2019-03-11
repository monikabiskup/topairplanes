package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiggestAircraftRepository extends JpaRepository<BiggestAircraft, Integer> {
}
