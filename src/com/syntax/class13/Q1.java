package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
	/*
	 * Write a program to swap 2 numbers without a temporary variable?
	 * swap 2 strings without a temporary variable?
	 */

		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;
		System.out.println("the value of a: "+a);
		System.out.println("the value of b: "+b);
		
		String str="Day";
		String str2="night";
		str=str+str2;//dayNight
		str2=str.substring(0,3);// day
		str=str.substring(3);//night
		System.out.println("the value of str: "+str);
		System.out.println("the value of str2: "+str2);
		
		// in general way 
		
		
		// another way
		String s1="Hello";
		String s2="bye";
		
		String shorterstr1 = s1+s2;
		s2 = shorterstr1.replace(s2, "");
		s1 = shorterstr1.replace(s2, "");
		
		System.out.println("The value of s1 = "+s1);
		System.out.println("The value of s2 = "+s2);
		
	}

}
