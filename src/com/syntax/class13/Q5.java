package com.syntax.class13;

public class Q5 {

	public static void main(String[] args) {
		// reverse string char by char
		// word by word
		
		String given="I Love Java";
		String rev="";
		for (int i=given.length()-1;i>=0;i--) {
			
			rev=rev+given.charAt(i);
		}
		
		System.out.println("reversed string = "+rev);
		String [] array=given.split(" ");
		String reverse="";
		for (int i=array.length-1;i>=0;i--) {
			reverse=reverse+array[i]+" ";
			
		}
		System.out.println("reversed words = "+reverse);
	}

}
