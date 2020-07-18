package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAddress {
    private final String street;
    private final String suite;
    private final String city;
    private final String zipcode;
    private final UserAddressGeo geo;

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
    
    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public UserAddressGeo getGeo() {
        return geo;
    }

}