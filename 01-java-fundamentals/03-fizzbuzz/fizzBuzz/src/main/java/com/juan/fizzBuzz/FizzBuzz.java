package com.juan.fizzBuzz;

public class FizzBuzz {
	public void fizzBuzzTest() {
		for (int i = 1; i <= 100; i++) {
			String result = fizzBuzz(i);
		    System.out.println(result);
		   }
		 }

	public String fizzBuzz(int value) { 
		if (value % 3 == 0) {
		    return "Fizz";
		  }
		else if (value % 5 == 0) {
		    return "Buzz";
		  }
		else if (value % 3 == 0 && value % 5 == 0) {
			return "FizzBuzz";
		  }
		else {
			return Integer.toString(value);
		}
		  }
}
