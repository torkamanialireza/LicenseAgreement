package com.alireza.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alireza.relationships.models.Person;
import com.alireza.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	//return all persons
	public List<Person> allPersons(){
		return personRepository.findAll();	
	}
	//find Language
    public Person findPerson(Long id) {
    	Optional<Person> optionalPerson = personRepository.findById(id);
    	if (optionalPerson.isPresent()) {
    		return optionalPerson.get();
    	}else {
    		return null;
    	}
    }
}
