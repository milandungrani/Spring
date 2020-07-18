package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private int id;
    private final String name;
    private final String username;
    private final String email;
    private final UserAddress address;
    private final String phone;
    private final String website;
    private final UserCompany company;

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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public UserAddress getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public UserCompany getCompany() {
        return company;
    }
}
