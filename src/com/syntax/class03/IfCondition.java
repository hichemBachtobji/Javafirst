package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// declare a number and compare if number is larger than 100
		// if number is larger than 100 --> my number is large
		
		System.out.println("starting coding");
		
		int num=178;
		
		if(num>1000) {
			System.out.println("My namber is large");
		}
		
		System.out.println("End of the program");
		
		System.out.println("-----------------------");
		
		int expectedhours=15;
		int actualhours=15;
		// if actual is more than excpected --> you will love java
		
		if (actualhours>expectedhours) { // if true go inside the block
			
			System.out.println("you will love java");
			
		}else { // otherwise (if false) go inside else block
			
			System.out.println("you will not like java");
			System.out.println("------------------------------");
			
			double budget=10000;
			double carPrice= 12000;
			//using if we were doig verification and selective execution
			
			if(budget>carPrice) {
				System.out.println("I will buy this car today");
				System.out.println("I will be happy");
				
			}else {
				
				System.out.println("I will not buy this car today, "+ "I will go learn java");
				System.out.println(" I will be motivated");
			}
			
			System.out.println("I am code after if condition");
		}
	}

}
