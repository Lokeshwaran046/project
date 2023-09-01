package com.example.eventmanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.entities.Guestentities;
import com.example.eventmanagement.service.Guestservice;

@RestController
public class Guestcontrol {
@Autowired
Guestservice guest;
@PostMapping("/addguest")
public Guestentities createGuestentites(@RequestBody Guestentities gues)
{
	return guest.addinfo(gues);
}
@GetMapping("/showguest")
public List<Guestentities>getAllGuestentites(){
	return guest.show();
}
}