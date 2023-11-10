package com.senai.apivsconnect;

import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API vsconnect", version = "1.0.0", description = ""))
public class ApivsconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivsconnectApplication.class, args);

	}

}
