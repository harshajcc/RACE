package com.ts.race;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.ts.dao")
@EntityScan(basePackages="com.ts.model")
@SpringBootApplication(scanBasePackages="com.ts")
public class RaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaceApplication.class, args);
	}

}
