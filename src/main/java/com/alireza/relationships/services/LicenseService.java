package com.alireza.relationships.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alireza.relationships.models.License;
import com.alireza.relationships.models.Person;
import com.alireza.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private static String newNumber = "00001";
	private final LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// returns all the license
    public List<License> allLicences() {
        return licenseRepository.findAll();
    }
 // create license
    public License createLicense(License b) {	
    	b.setNumber(newNumber);
    	
    	
    	newNumber = String.format("%06d", Integer.parseInt(newNumber)+1);
    	return licenseRepository.save(b);
    }
  //find License
    public License findLicense(Long id) {
    	Optional<License> optionalLicense = licenseRepository.findById(id);
    	if (optionalLicense.isPresent()) {
    		return optionalLicense.get();
    	}else {
    		return null;
    	}
    }
  //update license in post
    public License updateLicense(Long id, String number, Date expiration_date, String state, Person person) {
    	Optional<License> temp = licenseRepository.findById(id);
    	License license = temp.get();
    	license.setNumber(number);
    	license.setExpiration_date(expiration_date);
    	license.setState(state);
    	license.setPerson(person);
    	return licenseRepository.save(license);
    	
    }
    public License updateLicense(License license) {
    	return licenseRepository.save(license);
    }
    //delete language
    public void deleteLicense(Long id) {
    	licenseRepository.deleteById(id);
    }
}
