package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter private int id;
    @Getter private final String name;
    @Getter private final String username;
    @Getter private final String email;
    @Getter private final UserAddress address;
    @Getter private final String phone;
    @Getter private final String website;
    @Getter private final UserCompany company;

    public User(@JsonProperty("id") int id, 
                @JsonProperty("name") String name,
                @JsonProperty("username") String username,
                @JsonProperty("email") String email,
                @JsonProperty("address") UserAddress address,
                @JsonProperty("phone") String phone,
                @JsonProperty("website") String website,
                @JsonProperty("company") UserCompany company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
    
}
