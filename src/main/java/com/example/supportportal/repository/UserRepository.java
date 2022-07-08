package com.example.supportportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supportportal.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
   User findUserByUsername(String username);
   
   User findUserByEmail(String email);
   
   
}
