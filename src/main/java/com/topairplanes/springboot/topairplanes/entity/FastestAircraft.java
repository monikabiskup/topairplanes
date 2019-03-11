package com.topairplanes.springboot.topairplanes.entity;

import javax.persistence.*;

@Entity
@Table(name = "fastest_aircrafts")
public class FastestAircraft {

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

    @Column(name = "category")
    private String category;

    @Column(name = "speed")
    private String speed;

    public FastestAircraft() {
    }

    public FastestAircraft(String name, String producer, String country, String category, String speed) {
        this.name = name;
        this.producer = producer;
        this.country = country;
        this.category = category;
        this.speed = speed;
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

    public String getCategory() {
        return category;
    }

    public String getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "FastestAircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", category='" + category + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
