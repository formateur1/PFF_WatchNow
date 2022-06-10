package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.service.OeuvreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Test
@RestController
@RequestMapping("/oeuvre")
public class OeuvreController {

	@Autowired
	private OeuvreService oeuvreService;
	
	@GetMapping("/oeuvre/titre/{titre}")
	public ResponseEntity<List<Oeuvre>> getOeuvreByTitre(@PathVariable String titre) {
		return new ResponseEntity<List<Oeuvre>>(oeuvreService.getByTitre(titre), HttpStatus.OK);
	}
	
	@GetMapping("/oeuvre/id/{id}")
	public ResponseEntity<Oeuvre> getOeuvreById(@PathVariable String id) {
		return new ResponseEntity<Oeuvre>(oeuvreService.getById(id), HttpStatus.OK);
	}
}
