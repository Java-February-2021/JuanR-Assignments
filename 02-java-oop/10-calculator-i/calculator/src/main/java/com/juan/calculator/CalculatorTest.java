package com.juan.calculator;

import com.juan.calculator.models.Calculator;

public class CalculatorTest {
	  public static void main(String[] args) {
		    Calculator c = new Calculator();
		    c.setNum1(20);
		    c.setNum2(6);
		    c.setOperator('+');
		    c.performOperation();
		    c.getResults();
		  }
}
