package com.example.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvcboot.model.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens", produces="application/xml")
//	@ResponseBody
	public List<Alien> getAliens() {
		System.out.println("Getting Aliens");
		List<Alien> aliens = repo.findAll();
		return aliens;
	}
	
	@GetMapping("alien/{id}")
//	@ResponseBody
	public Alien getAlien(@PathVariable("id") int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien(0, ""));
		return alien;
	}
	
	@PostMapping(path="alien",consumes={"application/json"})
	public Alien addAlien(@RequestBody Alien a) {
		repo.save(a);
		return a;
	}
}