package com.example.kinozippyv3.dto;

import com.example.kinozippyv3.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

  @JsonProperty
  private String username;

  @JsonProperty
  private String password;

  public UserRequest (String username, String password) {
    this.username = username;
    this.password = password;
  }
}
