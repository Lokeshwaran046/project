package com.example.eventmanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.entities.Administrentities;
import com.example.eventmanagement.service.Administrativeservice;

@RestController
public class Administrativecontrol {
@Autowired
Administrativeservice admin;
@PostMapping("/addadmin")
public Administrentities createAdministrentities(@RequestBody Administrentities admi)
{
	return admin.addinfo(admi);

}
@GetMapping("/showadmin")
public List<Administrentities> getAllAdministrentities(){
	return admin.show();
}
}