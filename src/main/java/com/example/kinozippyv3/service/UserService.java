package com.example.kinozippyv3.service;

import com.example.kinozippyv3.dto.UserResponse;
import com.example.kinozippyv3.model.User;
import com.example.kinozippyv3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
  @Autowired
  public UserRepository userRepository;
  public User createUser(User user){
    return userRepository.save(user);
  }

  public List<UserResponse> all() {
    List<User> users = userRepository.findAll();
    List<UserResponse> responses = new ArrayList<UserResponse>();
    for (int i = 0; i < users.size(); i++) {
      UserResponse userResponse = new UserResponse(users.get(i));
      responses.add(userResponse);
    }
    return responses;
    //return users.stream().map(u->new UserResponse(u)).collect(Collectors.toList());
  }

}
