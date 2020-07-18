package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCompany {
    private final String name;
    private final String catchPhrase;
    private final String bs;

    public UserCompany(@JsonProperty("name") String name,
                       @JsonProperty("catchPhrase") String catchPhrase,
                       @JsonProperty("bs") String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }
}