package com.juan.firstJavaProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstJavaProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJavaProgramApplication.class, args);
		
		String name = "Juan ";
		int age = 24;
		String homeTown = "Redwood City, CA";
		System.out.println("My name is " + name + "I am " + age + " My hometown is " + homeTown);
	}

}
