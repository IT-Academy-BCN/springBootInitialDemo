package com.nivell3.springBootNivell3Demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class Nivell3Controller {

	@GetMapping("")
    public String helloWorld(@RequestParam(value = "nom", defaultValue = "World") String nom) {
    	return String.format("Hello %s", nom);
    	
    }
}
