package com.example.kinozippyv3.repository;

import com.example.kinozippyv3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
