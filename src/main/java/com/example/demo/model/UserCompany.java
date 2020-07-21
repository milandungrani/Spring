package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class UserCompany {
    @Getter private final String name;
    @Getter private final String catchPhrase;
    @Getter private final String bs;

    public UserCompany(@JsonProperty("name") String name,
                       @JsonProperty("catchPhrase") String catchPhrase,
                       @JsonProperty("bs") String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

}