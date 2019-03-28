package com.reno.repository;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.reno.entity.Skate;

@Component
public class SkateCommandLineRunner implements CommandLineRunner {
	
	private final SkateRepository repository;
	
	public SkateCommandLineRunner(SkateRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Flip","Baker","DarkStart","Scorpion","Five","Borracho", "Santa Cruz").forEach(name ->
		repository.save(new Skate(name)));
		repository.findAll().forEach(System.out::print);		
	}

}
