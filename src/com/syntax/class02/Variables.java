package com.syntax.class02;

public class Variables {
	
	public static void main (String[] args) {
		
		String name= "Hichem";
		
		String lastName= "Bachtobji";
		
		char grade= 'A';
		
		String city= "Tunisia";
		
		String State= "Tunisia";
		
		long phoneNumber= 123456789;
		
		System.out.println(name);
		
		System.out.println(lastName);
		
		System.out.println(grade);
		
		System.out.println(city);
		
		System.out.println(State);
		
		System.out.println(phoneNumber);
		
		// no need to put String a second time if we want to change variables.
		
		// String city="chantilly";--> error saying duplic
		
		city="chantilly";
		State="VA";
		
		phoneNumber=676338927;
		
		System.out.println(city);
		
		System.out.println("my name is"+" "+name+" and my last name is "+lastName+ " "+"I live in city of "+city+" is state of"+" "+State+" "+ "and my phone number is"+" "+phoneNumber);		
		
		
		
				
				
	}

}
