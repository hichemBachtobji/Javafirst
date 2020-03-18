package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {
		
	// to get substring from a given String 
		//substring =String inside your string
		
		System.out.println("-------substring() Function----");
		
		String str="Today is a rainy day";
		// printout is a rainy day
		String partialString=str.substring(6);//starts from 6 until the end of string
		System.out.println(partialString);
		
		// rainy day
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);//starts from 0 end at index 5
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);

	}

}
