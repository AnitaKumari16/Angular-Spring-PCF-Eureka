package com.Capitals.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Capitals.Controller")
public class SwaggerDocketAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDocketAppApplication.class, args);
	}

}
