package com.syntax.class34;

public class task1 {
	
	public static void age() {
		
		int age = 0;
		if(age<16) {
			throw new RuntimeException("you are under age");
		}else {
			System.out.println("you are a legal age");
		}
		
	}
	

	public static void main(String[] args) {
		
		//Create a method to check age eligibility that will throw a runtime exception.
		//Method should throw an exception age is less than 16.
		
		age();

	}

}
