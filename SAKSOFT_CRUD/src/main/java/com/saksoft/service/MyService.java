package com.saksoft.service;

import java.util.List;

import com.saksoft.model.PersonsDetails;

public interface MyService {
     
	
	public PersonsDetails addPersonsDetails(PersonsDetails persons);
	
	
	public List<PersonsDetails> getAllPersonDetails();
	
	public PersonsDetails saveOrUpdate(PersonsDetails person);
	
	public void deleteDetails(int id);
}
