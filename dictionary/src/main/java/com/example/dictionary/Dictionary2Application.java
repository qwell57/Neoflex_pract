package com.example.dictionary;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(info = @Info(title = "practice", version = "1.0", description = "My practice"))
@SpringBootApplication
public class Dictionary2Application {
	public static void main(String[] args) {
		SpringApplication.run(Dictionary2Application.class, args);
	}

}
