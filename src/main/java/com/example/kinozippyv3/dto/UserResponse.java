package com.example.kinozippyv3.dto;

import com.example.kinozippyv3.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
  @JsonProperty
  private String username;

  public  UserResponse (String username) {
    this.username = username;
  }

  public UserResponse(User user) {
    this.username = user.getUsername();
  }
}
