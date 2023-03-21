package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.dto.UserResponse;
import com.example.kinozippyv3.exception.NotFoundException;
import com.example.kinozippyv3.model.User;
import com.example.kinozippyv3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserResponse> findUsers() {
        return userService.all();
    }


    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        System.out.println(user);
        return userService.createUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        // Her tjekker vi om brugeren findes. Hvis ikke thrower vi en exception og status meddelelse
        userService.userRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "bruger ikke fundet"));

        try{
            userService.deleteUser(id);
            return new ResponseEntity<>("User deleted" ,HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(e.getMessage() ,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        userService.updateUser(id, updatedUser);

    }
    */


    @PatchMapping("/updateUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        User existingUser = userService.userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found with id " + id));
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        User updatedUser = userService.userRepository.save(existingUser);
        return ResponseEntity.ok(updatedUser);
    }

}
