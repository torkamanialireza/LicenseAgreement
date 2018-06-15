package com.alireza.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alireza.relationships.models.License;
import com.alireza.relationships.models.Person;
import com.alireza.relationships.services.LicenseService;
import com.alireza.relationships.services.PersonService;

@Controller
public class LicensesController {
		
		private final PersonService personService;
		private final LicenseService licenseService;
		public LicensesController(PersonService personService, LicenseService licenseService) {
			this.personService = personService;
			this.licenseService = licenseService;
		}
	@RequestMapping("/licenses")
	public String indexlicense(Model model) {
		List <Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);		
		return ("/licenses/index.jsp");
	}
	@RequestMapping("/licenses/new")
	public String newlicense(Model model) {
		List <Person> persons = personService.allPersons();
		
		model.addAttribute("persons", persons);
		return ("/licenses/new.jsp");
	}
	@PostMapping(value="/createl")
	 public String create(@Valid @ModelAttribute("license") License license,@ModelAttribute("person") Person person, BindingResult result) {
		 
	     if (result.hasErrors()) {	   
	    	 return "/licenses/new.jsp";
	     } else {        	
	            licenseService.createLicense(license);
	            return "redirect:/licenses/new";
	     }
	 }
	@RequestMapping(value="/licenses/edit/{id}",method=RequestMethod.PUT)
	public String updateLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
	    	 
	         return "/licenses/edit.jsp";
	     } else {

	    	 licenseService.updateLicense(license);
	         return "redirect:/licenses";
	     }
			
	 }

}
