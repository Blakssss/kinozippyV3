package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.model.Movie;
import com.example.kinozippyv3.model.Showing;
import com.example.kinozippyv3.repository.ShowingRepository;
import com.example.kinozippyv3.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ShowingController {
  @Autowired
  ShowingRepository showingRepository;

  @GetMapping("/showings")
  public List<Showing> findShowing(){
    return showingRepository.findAll();
  }

  @PostMapping("/showing")
  public Showing createMovie(@RequestBody Showing showing){
    System.out.println(showing);
    return showingRepository.save(showing);
  }

}
