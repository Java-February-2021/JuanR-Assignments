package com.juan.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.lookify.models.Song;
import com.juan.lookify.repositories.SongRepository;
@Service
public class SongService {
	
	private SongRepository sRepo;
	
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	
	
	// Get All
	public List<Song> getAllSongs() {
		return this.sRepo.findAll();
	}
	
	// Get One
	public Song getOneSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	// Create Song
	public Song createSong(Song newSong) {
		return this.sRepo.save(newSong);
	}
	
	// Update Song
	public Song updateSong(Song updatedSong) {
		return this.sRepo.save(updatedSong);
	}
	
	// Delete Song
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
}
