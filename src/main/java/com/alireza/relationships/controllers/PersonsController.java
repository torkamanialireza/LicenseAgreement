package com.alireza.relationships.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alireza.relationships.models.Person;
import com.alireza.relationships.services.PersonService;

@Controller
public class PersonsController {	
	private final PersonService personService;
	
	public PersonsController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/persons")
	public String index(Model model) {
		List <Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return ("persons/index.jsp");	
	}
	@RequestMapping("/persons/new")
	public String newPerson() {
		return "persons/new.jsp";
	}
	@RequestMapping("/persons/{id}")
	public String showPerson(Model model, @PathVariable("id") Long id) {
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "persons/show.jsp";
	}
	@RequestMapping("/create")
	public String createPerson() {
		
		return "redirect:persons/new";
	}

}
