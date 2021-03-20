package com.juan.dojoOverFlow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.dojoOverFlow.models.Question;
import com.juan.dojoOverFlow.models.Tag;
import com.juan.dojoOverFlow.services.AnswerService;
import com.juan.dojoOverFlow.services.QuestionService;
import com.juan.dojoOverFlow.services.TagService;

@Controller
@RequestMapping("/questions")
public class QuestionController {
	@Autowired
	private QuestionService qService;
	@Autowired
	private AnswerService aService;
	@Autowired
	private TagService tService;
	
	
	@GetMapping("")
	public String index(Model viewModel) {
		List<Question> allQuestions = this.qService.getAllQuestions();
		viewModel.addAttribute("allQuestions", allQuestions);
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/addQuestion")
	public String addQuestion(@ModelAttribute("question")Question question) {
		return "redirect:/dashboard";
	}
	
	@GetMapping("/{id}")
	public String singleQuestion(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("question")Question question, @ModelAttribute("tag")Tag tag) {
		viewModel.addAttribute("tag", this.qService.getOneQuestion(id));
		return "singleQuestion.jsp";
	}
}
