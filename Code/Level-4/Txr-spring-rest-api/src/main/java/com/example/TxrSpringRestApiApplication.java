package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories
public class TxrSpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxrSpringRestApiApplication.class, args);
	}

}
