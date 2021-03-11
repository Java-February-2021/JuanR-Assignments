package com.juan.license.services;

import org.springframework.stereotype.Service;

import com.juan.license.models.License;
import com.juan.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository lRepo;
	
	public LicenseService(LicenseRepository repo) {
		this.lRepo = repo;
	}
	
	// Get one License
	public License getOneLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	// Create new License
	public License createLicense(License newLicense) {
	return this.lRepo.save(newLicense); 
	}
}
