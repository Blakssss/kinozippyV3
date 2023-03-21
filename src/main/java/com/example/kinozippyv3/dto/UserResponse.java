package com.example.kinozippyv3.dto;

import com.example.kinozippyv3.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {

    @JsonProperty
    private int id;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;

    public UserResponse(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();

    }
}
