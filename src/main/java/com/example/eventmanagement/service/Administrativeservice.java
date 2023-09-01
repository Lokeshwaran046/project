package com.example.eventmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.entities.Administrentities;
import com.example.eventmanagement.repository.Administrativerepo;

@Service
public class Administrativeservice {
@Autowired
Administrativerepo adminrep;
public Administrentities addinfo(Administrentities admin)
{
	return adminrep.save(admin);
	

}
public List<Administrentities>show()
{
	return adminrep.findAll();
}
}