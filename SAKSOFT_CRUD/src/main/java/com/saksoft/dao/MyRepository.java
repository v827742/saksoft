package com.saksoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saksoft.model.PersonsDetails;

public interface MyRepository extends JpaRepository<PersonsDetails, Integer>{

}
