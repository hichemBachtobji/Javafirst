package com.syntax.class34;

//Create a method checkUserName that will throw a runtime exception. 
//Method should throw an exception when entered username is less than 5 characters.

public class task2 {
	
	public static void name(String Uname) {
		
		if(Uname.length()<5) {
			
			throw new RuntimeException("invalid user name");
			
		}else {
			System.out.println("user name is valid");
		}
		
	}
	
	public static void main(String[] args) {
		
		name("hich");
		
	}

}
