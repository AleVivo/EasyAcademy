package com.easyacademy.easyacademy_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EasyAcademyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyAcademyBackendApplication.class, args);
	}

}
