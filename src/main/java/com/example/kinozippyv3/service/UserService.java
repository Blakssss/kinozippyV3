package com.example.kinozippyv3.service;

import com.example.kinozippyv3.model.User;
import com.example.kinozippyv3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  public UserRepository userRepository;
  public User createUser(User user){
    return userRepository.save(user);
  }

}
