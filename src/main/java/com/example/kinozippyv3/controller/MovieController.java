package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.model.Movie;
import com.example.kinozippyv3.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MovieController {


  @Autowired
  MovieService movieService;

  @GetMapping("/movies")
  public List<Movie> findMovies(){
    return movieService.movieRepository.findAll();
  }

  @PostMapping("/movie")
  public Movie createMovie(@RequestBody Movie movie){
    System.out.println(movie);
    return movieService.createMovie(movie);
  }

  @DeleteMapping("/movie")
  public void deleteMovie(@RequestParam String title){
    movieService.deleteMovie(title);
  }

  @PutMapping("/movie")
  public Movie updateMovie(@RequestParam String title, @RequestBody Movie movie){
    return movieService.updateMovie(title, movie);
  }

}
