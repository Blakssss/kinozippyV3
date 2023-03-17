package com.example.kinozippyv3.repository;

import com.example.kinozippyv3.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
