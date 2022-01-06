package com.example.spring.primeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimeiroApplication {
        @GetMapping("/first")
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroApplication.class, args);
                System.out.println("Mensagem na tela");
	}

}
