package com.example.kinozippyv3.model;

import jakarta.persistence.*;

@Entity
public class Showing {

  @Id
  private int seat;

  @OneToOne
  @JoinColumn(name = "movie", referencedColumnName = "title")
  private Movie movie;

  @OneToOne
  @JoinColumn(name = "id", referencedColumnName = "id")
  private User user;

  public Showing() {

  }


  public int getSeat() {
    return seat;
  }

  public void setSeat(int seat) {
    this.seat = seat;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Showing(int seat, Movie movie, User user) {
    this.seat = seat;
    this.movie = movie;
    this.user = user;
  }

}


