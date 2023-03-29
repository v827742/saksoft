package com.saksoft.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.model.PersonsDetails;
import com.saksoft.serviceImpl.ServiceImpl;

@RestController
public class HomeController {

@Autowired
private ServiceImpl serviceImpl;

@PostMapping("/addPersonDetails")
public PersonsDetails savePersoDetails(@RequestBody PersonsDetails persons) {
	
	return serviceImpl.addPersonsDetails(persons);
	
}


@GetMapping("/getDetails")
public List<PersonsDetails> getPersoDetails() {
	
	return serviceImpl.getAllPersonDetails();	
}
@PutMapping("/updateDetails")
public PersonsDetails updatePersoDetails(@RequestBody PersonsDetails person) {
	
	return serviceImpl.saveOrUpdate(person);
	
}
@DeleteMapping("/deleteDetals/{id}")
public void deleteDetails(@PathVariable("id") int id) {
	serviceImpl.deleteDetails(id);
	
	
}



}
