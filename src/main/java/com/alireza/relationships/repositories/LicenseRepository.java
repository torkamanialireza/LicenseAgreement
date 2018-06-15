package com.alireza.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alireza.relationships.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License , Long> {
	List<License> findAll(); 
	
	List<License> findByPersonContaining(String search);
	
	List<License> findByStateContaining(String search);
	
	Long countByStateContaining(String search);
	
	Long countByPersonContaining(String search);
	
	Long deleteByPersonStartingWith(String search);
}
