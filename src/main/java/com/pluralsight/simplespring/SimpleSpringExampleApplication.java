package com.pluralsight.simplespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringExampleApplication implements CommandLineRunner {

	@Autowired
	FortuneTeller fortuneTeller;

	@Autowired
	PetDAO petDAO;

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot!");
		System.out.println(fortuneTeller.predictTheFuture());
		// I want a pet to share this with
		Pet p = petDAO.getPetById();
		System.out.println(p.toString());

	}
}
