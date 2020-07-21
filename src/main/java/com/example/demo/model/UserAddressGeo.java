package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class UserAddressGeo {
    @Getter private final String lat;
    @Getter private final String lng;

    public UserAddressGeo(@JsonProperty("lat") String lat,
                          @JsonProperty("lng") String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    
}