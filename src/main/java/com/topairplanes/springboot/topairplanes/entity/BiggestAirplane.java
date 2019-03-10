package com.topairplanes.springboot.topairplanes.entity;

import javax.persistence.*;

@Entity
@Table(name="biggest_airplanes")
public class BiggestAirplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="producer")
    private String producer;

    @Column(name="country")
    private String country;

    @Column(name="wingspan")
    private double wingspan;

    @Column(name="hull_length")
    private double hullLength;

    @Column(name="passenger")
    private boolean passenger;

    @Column(name="military")
    private boolean military;

    @Column(name="carrying")
    private boolean carrying;

    public BiggestAirplane() {
    }

    public BiggestAirplane(String name, String producer, String country, double wingspan, double hullLength, boolean passenger, boolean military, boolean carrying) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getHullLength() {
        return hullLength;
    }

    public void setHullLength(double hullLength) {
        this.hullLength = hullLength;
    }

    public boolean isPassenger() {
        return passenger;
    }

    public void setPassenger(boolean passenger) {
        this.passenger = passenger;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public boolean isCarrying() {
        return carrying;
    }

    public void setCarrying(boolean carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "BiggestAirplane{" +
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