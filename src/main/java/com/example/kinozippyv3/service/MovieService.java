package com.example.kinozippyv3.service;

import com.example.kinozippyv3.model.Movie;
import com.example.kinozippyv3.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {
  @Autowired
  public MovieRepository movieRepository;
  public Movie createMovie(Movie movie){
    return movieRepository.save(movie);
  }

}
