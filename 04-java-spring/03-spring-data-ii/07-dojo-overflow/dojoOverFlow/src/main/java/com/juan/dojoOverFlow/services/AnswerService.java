package com.juan.dojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojoOverFlow.models.Answer;
import com.juan.dojoOverFlow.repositories.AnswerRepository;

@Service
public class AnswerService {
	private AnswerRepository aRepo;
	
	public AnswerService(AnswerRepository repo) {
		this.aRepo = repo;
	}
	
	// Get All
	public List<Answer> getAllAnswers() {
		return this.aRepo.findAll();
	}
	
	// Get One
	public Answer getOneAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	// Create
	public Answer createAnswer(Answer newAnswer) {
		return this.aRepo.save(newAnswer);
	}
}
