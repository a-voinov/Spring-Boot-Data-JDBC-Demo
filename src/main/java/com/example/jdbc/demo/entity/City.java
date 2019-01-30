package com.example.jdbc.demo.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Entity to demonstrate one-to-many relationship
 */
public class City {
    @Id
    private Integer cityId;
    private String city;
    private Date lastUpdate;
    private Integer countryId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
