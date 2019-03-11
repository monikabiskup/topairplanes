package com.topairplanes.springboot.topairplanes.entity;

import javax.persistence.*;

@Entity
@Table(name = "biggest_aircrafts")
public class BiggestAircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "producer")
    private String producer;

    @Column(name = "country")
    private String country;

    @Column(name = "wingspan")
    private double wingspan;

    @Column(name = "hull_length")
    private double hullLength;

    @Column(name = "passenger")
    private boolean passenger;

    @Column(name = "military")
    private boolean military;

    @Column(name = "carrying")
    private boolean carrying;

    public BiggestAircraft() {
    }

    public BiggestAircraft(String name, String producer, String country, double wingspan, double hullLength, boolean passenger, boolean military, boolean carrying) {
        this.name = name;
        this.producer = producer;
        this.country = country;
        this.wingspan = wingspan;
        this.hullLength = hullLength;
        this.passenger = passenger;
        this.military = military;
        this.carrying = carrying;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public String getCountry() {
        return country;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getHullLength() {
        return hullLength;
    }

    public boolean isPassenger() {
        return passenger;
    }

    public boolean isMilitary() {
        return military;
    }

    public boolean isCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return "BiggestAircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", wingspan=" + wingspan +
                ", hullLength=" + hullLength +
                ", passenger=" + passenger +
                ", military=" + military +
                ", carrying=" + carrying +
                '}';
    }
}
