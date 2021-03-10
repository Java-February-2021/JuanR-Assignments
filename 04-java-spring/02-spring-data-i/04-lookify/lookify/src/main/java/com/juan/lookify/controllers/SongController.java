package com.juan.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juan.lookify.models.Song;
import com.juan.lookify.services.SongService;

@Controller
public class SongController {
	@Autowired
	private SongService sService;
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model viewModel) {
		List<Song> allSongs = this.sService.getAllSongs();
		viewModel.addAttribute("allSongs", allSongs);
		return "dashboard.jsp";
	}
	
	@GetMapping("/add")
	public String add(@ModelAttribute("song") Song song) {
		return "add.jsp";
	}
	
	@PostMapping("/add")
	public String add(@Valid @ModelAttribute("song") Song newSong, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		} else {
			this.sService.createSong(newSong);
			return "redirect:/";
		}
	}
	
	@GetMapping("/{id}")
	public String singleSong(@PathVariable("id")Long id, Model viewModel, @ModelAttribute("song") Song song) {
		viewModel.addAttribute("song", this.sService.getOneSong(id));
		return "show.jsp";
	}
	
	
	
}
