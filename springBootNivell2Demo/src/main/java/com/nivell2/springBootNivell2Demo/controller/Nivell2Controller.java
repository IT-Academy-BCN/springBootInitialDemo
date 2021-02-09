package com.nivell2.springBootNivell2Demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class Nivell2Controller {
    
    @GetMapping("")
    public String helloWorld(@RequestParam(value = "nom", defaultValue = "World") String nom) {
    	return String.format("Hello %s", nom);
    }
}
