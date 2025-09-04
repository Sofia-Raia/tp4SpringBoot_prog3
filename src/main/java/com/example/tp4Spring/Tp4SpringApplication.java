package com.example.tp4Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.utn.demo_rest")//paquete padre de la app
public class Tp4SpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(Tp4SpringApplication.class, args);

	}

}
