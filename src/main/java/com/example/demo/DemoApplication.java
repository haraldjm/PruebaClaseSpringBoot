package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Prepárate para recibir peticiones HTTP (REST)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String hellow(){
		return "Hello World!";
	}

	@RequestMapping("/hola")
	String hellom(){
		return "Hola Mundo!";
	}
	@RequestMapping("/mimedicacion")
	String mimedicacion(){
		return "Tomate las pastillas!";
	}

}
