package com.example.kinozippyv3.dto;


public class BookingRequest {
  private int userid;
  private int showingId;
  private String seat;

  public BookingRequest(int userId, int showingId, String seat) {
    this.userid = userId;
    this.showingId = showingId;
    this.seat = seat;
  }

  public  int getUserId() {
    return userid;
  }

  public int getShowingId() {
    return userid;
  }

  public String getSeat() {
    return seat;
  }

  public void setUserId(int userId) {
    this.userid = userId;
  }

  public void setShowingId(int showingId) {
    this.showingId = showingId;
  }
}
