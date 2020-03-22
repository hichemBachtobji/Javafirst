package com.syntax.class15;

public class Task {
	
	void numbers(int a , int b) {
		
		if (a>b) {
			System.out.println("number "+a +">"+ b);
		}else {
			System.out.println("number "+a +"<"+ b);
		}
	}
	
	void numbers1(int a) {
		
		if (a %2==0) {
			System.out.println(a+ " is even ");
		}else {
			System.out.println(a+ " is odd ");
		}
	}

	void palind(String word) {
		char[] charArray=word.toCharArray();
		String rev="";
		for (int i=word.length()-1;i>=0;i--) {
			rev=rev+charArray[i];
		}
		if (word.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
	}
	
	void lang(String country, String greet) {
		
		
			System.out.println("Hello in "+country +" is "+greet);
		
		
	}
	public static void main(String[] args) {
		
		Task obj =new Task();
		
		obj.lang("american","Hello");
		obj.lang("Tunisian","Asslema");
		obj.numbers1(5);
		obj.palind("anna");
		
		
		
	}
}
