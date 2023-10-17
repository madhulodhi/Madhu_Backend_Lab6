package com.gl.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gl.library") // Adjust the base package as needed

public class SpringBootLibraryDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("hello spring boot");
		System.out.println("Jai ho Gaurav sir");

	}

}
