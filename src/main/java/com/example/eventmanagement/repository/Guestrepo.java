package com.example.eventmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventmanagement.entities.Guestentities;

public interface Guestrepo extends JpaRepository<Guestentities, Integer>{

}