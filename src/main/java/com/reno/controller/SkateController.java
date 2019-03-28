package com.reno.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.entity.Skate;
import com.reno.repository.SkateRepository;

@RestController
public class SkateController {
	
	private SkateRepository repository;

	public SkateController(SkateRepository repository) {
		this.repository = repository;
	}
	


    @GetMapping("/good-skates")
    public Collection<Skate> goodSkates() {

        return repository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Skate skate) {
        return !skate.getName().equals("Scorpion") &&
                !skate.getName().equals("Five") &&
                !skate.getName().equals("Borracho") &&
                !skate.getName().equals("Santa Cruz");
    }
	

}
