package com.example.kinozippyv3.model;

import jakarta.persistence.*;

@Entity
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  private User user;

  @ManyToOne
  private Showing showing;

  private String seat;

  public Booking(int id, User user, Showing showing, String seat) {
    this.id = id;
    this.user = user;
    this.showing = showing;
    this.seat = seat;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public Booking() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Showing getShowing() {
    return showing;
  }

  public void setShowing(Showing showing) {
    this.showing = showing;
  }
}
