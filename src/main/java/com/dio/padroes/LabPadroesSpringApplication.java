package com.dio.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * - Swagger
 *
 * @author Samuel Bozza
 **/

@EnableFeignClients
@SpringBootApplication
public class LabPadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesSpringApplication.class, args);
	}
}
