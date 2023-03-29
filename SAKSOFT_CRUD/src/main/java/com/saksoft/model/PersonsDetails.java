package com.saksoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
   
	private String first_Name;
    
	private String last_Name;
  
	private String email;
    
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String First_Name) {
		first_Name = First_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonsDetails() {
		super();
		
	}
	public PersonsDetails(int id, String First_Name, String last_Name, String email, int age) {
		super();
		this.id = id;
		first_Name = First_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.age = age;
	}
	
	
}
