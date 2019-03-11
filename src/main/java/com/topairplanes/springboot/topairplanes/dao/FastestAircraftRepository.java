package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.FastestAircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FastestAircraftRepository extends JpaRepository<FastestAircraft, Integer> {
}
