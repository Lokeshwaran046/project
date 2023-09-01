package com.example.eventmanagement.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Guestentities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int guestid;
 private String Name;
 private int age;
 private String emailid;
 private String gender;
public Guestentities(int guestid, String name, int age, String emailid, String gender) {
	super();
	this.guestid = guestid;
	Name = name;
	this.age = age;
	this.emailid = emailid;
	this.gender = gender;
}
public int getGuestid() {
	return guestid;
}
public void setGuestid(int guestid) {
	this.guestid = guestid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}