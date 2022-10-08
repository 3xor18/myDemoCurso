package com.example.estadoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class EstadoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstadoAppApplication.class, args);
	}

}
