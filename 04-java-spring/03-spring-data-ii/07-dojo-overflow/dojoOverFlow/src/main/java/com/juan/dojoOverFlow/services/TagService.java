package com.juan.dojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojoOverFlow.models.Tag;
import com.juan.dojoOverFlow.repositories.TagRepository;

@Service
public class TagService {
	private TagRepository tRepo;
	
	public TagService(TagRepository repo) {
		this.tRepo = repo;
	}
	
	// Get All
	public List<Tag> getAllTags() {
		return this.tRepo.findAll();
	}
	
	// Get One
	public Tag getOneTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	// Create
	public Tag createTag(Tag newTag) {
		return this.tRepo.save(newTag);
	}
}
