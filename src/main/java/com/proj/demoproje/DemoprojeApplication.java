package com.proj.demoproje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoprojeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoprojeApplication.class, args);
	}

}
