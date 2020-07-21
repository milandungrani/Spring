package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class UserAddress {
    @Getter private final String street;
    @Getter private final String suite;
    @Getter private final String city;
    @Getter private final String zipcode;
    @Getter private final UserAddressGeo geo;

    public UserAddress(@JsonProperty("street") String street, 
                       @JsonProperty("suite") String suite, 
                       @JsonProperty("city") String city, 
                       @JsonProperty("zipcode") String zipcode, 
                       @JsonProperty("geo") UserAddressGeo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

}