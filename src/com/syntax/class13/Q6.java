package com.syntax.class13;

public class Q6 {

	public static void main(String[] args) {
		// write a java program to find whether s String is palindrome or not?
		
		String str ="Kayak";
		
		// 1st way
		
		char[] charArray=str.toCharArray();
		
		String reverse="";
		for (int i=charArray.length -1;i>=0;i--) {
			reverse +=charArray[i];
			
		}

		System.out.println("word is "+str);
		System.out.println("reverse is "+reverse);
		
		if (str.equals(reverse)) {
			System.out.println("yes it is a palindrome");
		}else {
			System.out.println("no, it is not a palindrome");
		}
		// use charAt() 
	}

}
