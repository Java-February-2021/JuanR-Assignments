package com.juan.pythagoreanTheorem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Math
@SpringBootApplication
public class PythagoreanTheoremApplication {

	public static void main(String[] args) {
		SpringApplication.run(PythagoreanTheoremApplication.class, args);
		
	}
	public static double calculateHypotenuse (int lenA, int lenB) {
		return Math.sqrt(lenA * lenB) + (lenB + lenB);
	}

}
