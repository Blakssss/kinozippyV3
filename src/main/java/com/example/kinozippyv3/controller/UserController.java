package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.model.User;
import com.example.kinozippyv3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {


  @Autowired
  UserService userService;

  @GetMapping("/users")
  public List<User> findUsers(){
    return userService.userRepository.findAll();
  }

  @PostMapping("/user")
  public User createUser(@RequestBody User user){
    System.out.println(user);
    return userService.createUser(user);
  }

}
