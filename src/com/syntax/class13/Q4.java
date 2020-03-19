package com.syntax.class13;

public class Q4 {

	public static void main(String[] args) {
		// find out how many alpha characters are present in a string?
		//find number of words in string?
		
		String str="hichem BACHTOBji 123$$%^&";
		str.replaceAll("[A-Za-z]", "");
		int number=str.length();
		System.out.println("number of alpha characters = "+number);
		
		String myString="Today is Wednesday";
		String [] array=myString.split(" ");
		int words=array.length;
		System.out.println("Total words in string: "+myString+" = "+words);

	}

}
