package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {

		int date = 15;

		String month = "February";

		String day = "saturday";

		// today is Saturday February 15;

		System.out.println("today is " + day + " " + month + " " + date);
		
		int num=100;
		num=num+1000;
		
		System.out.println(num);
		
		
	int mod=num%2;
	System.out.println(mod);
	
	int a=10;
	int b=20;
	
	String x="Hello";
	String y="bye";
			
			//Syso +ctrl+space--> autocomplete
	
	
	System.out.println(a+b+x+y);//30HelloBye
	System.out.println(a+x+b+y);//10Hello20Bye
	System.out.println(x+y+a+b);//HelloBye30 or HelloBye1020
	System.out.println(x+y+(a+b));
	//1020HelloBye:
	System.out.println(a+""+b+x+y);
	}

}
