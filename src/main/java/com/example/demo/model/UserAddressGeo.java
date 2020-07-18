package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAddressGeo {
    private final String lat;
    private final String lng;

    public UserAddressGeo(@JsonProperty("lat") String lat,
                          @JsonProperty("lng") String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}