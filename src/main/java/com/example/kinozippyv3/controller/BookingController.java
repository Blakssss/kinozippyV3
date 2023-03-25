package com.example.kinozippyv3.controller;

import com.example.kinozippyv3.dto.BookingRequest;
import com.example.kinozippyv3.model.Booking;
import com.example.kinozippyv3.model.Showing;
import com.example.kinozippyv3.model.User;
import com.example.kinozippyv3.repository.BookingRepository;
import com.example.kinozippyv3.repository.ShowingRepository;
import com.example.kinozippyv3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BookingController {
  @Autowired
  BookingRepository bookingRepository;
  @Autowired
  UserService userService;
  @Autowired
  ShowingRepository showingRepository;

  @GetMapping("/bookings")
  public List<Booking> findShowing(){
    return bookingRepository.findAll();
  }

 /*
 @PostMapping("/booking")
  public Booking createMovie(@RequestBody Booking booking){
    System.out.println(booking);

    return bookingRepository.save(booking);
  }

  */
  @PostMapping("/booking")
  public Booking createBooking(@RequestBody BookingRequest bookingRequest){
    System.out.println("når vi ned i controlleren?");
    // Retrieve the user and showing objects from the database using the ids in the booking object
    //User user = booking.getUser();
    User user = userService.userRepository.findById(bookingRequest.getUserId()).orElse(null);
    Showing showing = showingRepository.findById(bookingRequest.getShowingId()).orElse(null);

    // Create a new Booking object with the retrieved user and showing objects
    Booking newBooking = new Booking();
    newBooking.setUser(user);
    newBooking.setShowing(showing);
    newBooking.setSeat(bookingRequest.getSeat());

    newBooking = bookingRepository.save(newBooking);
    // Save the new booking to the database and return the updated booking object
    return newBooking;
  }

}
