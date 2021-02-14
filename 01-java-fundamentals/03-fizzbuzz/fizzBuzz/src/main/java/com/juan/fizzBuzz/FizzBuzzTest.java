package com.juan.fizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzTest {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzTest.class, args);
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzzTest();
	}
}
