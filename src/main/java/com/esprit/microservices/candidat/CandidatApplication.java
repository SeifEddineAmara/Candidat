package com.esprit.microservices.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatApplication.class, args);
	}

	@Autowired
	private CandidatRepository repository;

	@Bean
	ApplicationRunner init(){
		return (args)-> {
			repository.save(new Candidat("mariem", "ch","ma@esprit.tn"));
			repository.save(new Candidat("sarra", "ch","sa@esprit.tn"));
			repository.save(new Candidat("mohamed", "ch","na@esprit.tn"));
			repository.findAll().forEach(System.out::println);
		};


	}

}
