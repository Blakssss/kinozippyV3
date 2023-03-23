package com.example.kinozippyv3.repository;

import com.example.kinozippyv3.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    // Optional<Movie> findById(String title);
}
