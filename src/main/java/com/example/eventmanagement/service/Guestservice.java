package com.example.eventmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.entities.Guestentities;
import com.example.eventmanagement.repository.Guestrepo;

@Service
public class Guestservice {
@Autowired
Guestrepo guesrep;
public Guestentities addinfo(Guestentities guest)
{
	return guesrep.save(guest);
}
public List<Guestentities>show()
{
	return guesrep.findAll();
	
}
}