package br.com.dev.exerciciospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("br.com.dev.*")
@SpringBootApplication
public class ExercicioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioSpringApplication.class, args);
	}

}
