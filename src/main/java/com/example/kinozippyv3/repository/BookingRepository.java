package com.example.kinozippyv3.repository;

import com.example.kinozippyv3.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
