package com.plantier.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.plantier.api.utils.SenhaUtils;

@SpringBootApplication
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarCrypt("macho#23");
			System.out.println("Senha encoded: " + senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarCrypt("macho#23");
			System.out.println("Senha encoded novamente: " + senhaEncoded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("macho#23", senhaEncoded));
		};
	}
}
