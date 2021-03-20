package com.juan.dojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojoOverFlow.models.Question;
import com.juan.dojoOverFlow.repositories.QuestionRepository;

@Service
public class QuestionService {
	private QuestionRepository qRepo;
	
	public QuestionService(QuestionRepository repo) {
		this.qRepo = repo;
	}
	
	// Get All
	public List<Question> getAllQuestions() {
		return this.qRepo.findAll();
	}
	
	// Get One
	public Question getOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	// Create
	public Question createQuestion(Question newQuestion) {
		return this.qRepo.save(newQuestion);
	}
	
}
