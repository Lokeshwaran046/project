package com.example.eventmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrentities {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int adminid;
 private String name;
 private int age;
 private String gender;
 private String posting;
 private String role;
 
public Administrentities(int adminid, String name, int age, String gender, String posting, String role) {
	super();
	this.adminid = adminid;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.posting = posting;
	this.role = role;
}
public int getId() {
	return adminid;
}
public void setId(int adminid) {
	this.adminid = adminid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPosting() {
	return posting;
}
public void setPosting(String posting) {
	this.posting = posting;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
}