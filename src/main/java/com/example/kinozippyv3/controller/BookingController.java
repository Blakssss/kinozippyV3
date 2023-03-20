package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.model.Booking;
import com.example.kinozippyv3.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BookingController {
  @Autowired
  BookingRepository bookingRepository;

  @GetMapping("/bookings")
  public List<Booking> findShowing(){
    return bookingRepository.findAll();
  }

  @PostMapping("/booking")
  public Booking createMovie(@RequestBody Booking booking){
    System.out.println(booking);
    return bookingRepository.save(booking);
  }
}
