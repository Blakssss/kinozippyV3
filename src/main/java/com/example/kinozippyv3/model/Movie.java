package com.example.kinozippyv3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Movie {

  @Id
  private String title;
  private Date releaseDate;
  private double rating;
  private double length;
  private String genre;
  private int ageLimit;

@OneToMany(mappedBy = "movie")
private Set<Showing> showings = new HashSet<>();

  public Movie(String title, Date releaseDate, double rating, double length, String genre, int ageLimit, Set<Showing> showings) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.rating = rating;
    this.length = length;
    this.genre = genre;
    this.ageLimit = ageLimit;
    this.showings = showings;
  }

  public Movie() {

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getAgeLimit() {
    return ageLimit;
  }

  public void setAgeLimit(int ageLimit) {
    this.ageLimit = ageLimit;
  }
}
