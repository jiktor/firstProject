package com.project.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages ="com.project.firstProject")
@EntityScan("com.project.firstProject")
@EnableJpaRepositories(basePackages = "com.project.firstProject")
public class FirstProjectApplication {
	public static void main(String[] args) {

		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
