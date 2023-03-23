package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.model.Movie;
import com.example.kinozippyv3.repository.MovieRepository;
import com.example.kinozippyv3.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MovieController {


  @Autowired
  MovieService movieService;
  @Autowired
  MovieRepository movieRepository;

  @GetMapping("/movies")
  public List<Movie> findMovies() {
    return movieService.movieRepository.findAll();
  }

  @PostMapping("/movie")
  public Movie createMovie(@RequestBody Movie movie) {
    System.out.println(movie);
    return movieService.createMovie(movie);
  }


  @PutMapping("/movie")
  public Movie updateCount(@RequestBody Movie movie) {
      return movieRepository.save(movie);

  }



}
