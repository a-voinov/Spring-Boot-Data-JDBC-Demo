package com.example.jdbc.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.HashSet;
import java.util.Set;

/**
 *  Entity to demonstrate one-to-many relationship
 */
public class Country {
    @Id
    private Integer countryId;
    private String country;
    @Column("country_id")
    private Set<City> cities = new HashSet<>();

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}


