package com.juan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.languages.models.Language;
import com.juan.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	// Get All Languages
	public List<Language> getAllLanguages() {
		return this.lRepo.findAll();
	}
	// Get One Language
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	// Create New Language
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	public Language createLanguage(String name, String creator, int version) { 
		Language newLanguage = new Language(name, creator, version);
		return this.lRepo.save(newLanguage);
	}
	// Delete
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	
}
