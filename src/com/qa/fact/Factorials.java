package com.qa.fact;

import java.util.Scanner;

public class Factorials {

	static int number;
	
	public static Integer number() {
		Scanner numberScanner = new Scanner(System.in);
		number = numberScanner.nextInt();
		int number = Factorials.number;
	
		return number;
		
		
	
}
	
	public String calc() {
		
		int divisor = 2;
		
		while (number%divisor == 0) {
			number/= divisor;
			divisor++;
			
		}
//		return String.format("%d = ", number) + ((divisor % number == 0) ? String.format("%d!", divisor - 1) : "NONE");
			
		}
	}
	
	

