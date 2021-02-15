package com.juan.puzzling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PuzzlingTest {

	public static void main(String[] args) {
		SpringApplication.run(PuzzlingTest.class, args);
	
		Random r = new Random();
		ArrayList<Character> alphabet = new ArrayList<Character>();
		for(char ch = 'a'; ch <= 'z'; ++ch) {
			alphabet.add(ch);
		}
		int randomNum = r.nextInt(25);
		System.out.println(alphabet);
		Collections.shuffle(alphabet);
		System.out.println(alphabet);
		System.out.println(alphabet.get(25));
		System.out.println(randomNum);
		System.out.println(alphabet.get(randomNum));
	  }
	public static ArrayList<Integer> TrimArray(int[] numbers, int bound) {
		int[] nums = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int num : numbers) {
			if(num < bound)
				newList.add(num);
			
		}
		return newList;
	}
	
	

}
