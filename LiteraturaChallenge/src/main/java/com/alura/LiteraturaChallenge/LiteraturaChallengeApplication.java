package com.alura.LiteraturaChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import LiteraturChallenge.principal.Principal;

@SpringBootApplication
public class LiteraturaChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaChallengeApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		principal.muestraElMenu();
	}

}
