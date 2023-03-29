package com.saksoft.serviceImpl;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.dao.MyRepository;
import com.saksoft.model.PersonsDetails;
import com.saksoft.service.MyService;

@Service
public class ServiceImpl implements MyService{
    @Autowired
	private MyRepository myRepo;
	@Override
	public PersonsDetails addPersonsDetails(PersonsDetails person) {
		
		PersonsDetails details=myRepo.save(person);
		
		return details;
	}
	@Override
	public List<PersonsDetails> getAllPersonDetails() {
		
		return myRepo.findAll();
	}
	@Override
	public PersonsDetails saveOrUpdate(PersonsDetails person) {
		
		
		return myRepo.save(person);
	}
	@Override
	public void deleteDetails(int id) {
		
		myRepo.deleteById(id);
	}

	
	
}
