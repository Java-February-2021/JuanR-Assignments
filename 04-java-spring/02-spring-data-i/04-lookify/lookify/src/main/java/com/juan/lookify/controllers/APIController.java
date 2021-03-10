package com.juan.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.lookify.models.Song;
import com.juan.lookify.services.SongService;

@RestController
@RequestMapping("/search")
public class APIController {
	@Autowired
	private SongService sService;
	
	@GetMapping("")
	public List<Song> index() {
	return 	this.sService.getAllSongs();
	}
	
	// Get One Song
	@GetMapping("/{id}")
	public Song getSong(@PathVariable("id")Long id) {
		return this.sService.getOneSong(id);
	}
	
	// Create Song
	@PostMapping("/add")
	public Song create(Song newSong) {
		return this.sService.createSong(newSong);
	}
	
	// Delete Song
	@DeleteMapping("/team/{id}")
	public String deleteSong(@PathVariable("id")Long id) {
		this.sService.deleteSong(id);
		return id + " song has been deleted";
	}
	
}
