package com.syntax.class08;

import java.util.Scanner;

public class exercice {

	public static void main(String[] args) {
		// write a program to calculate sum of odds and sum of even numbers
		//1 to 99
		
		int even = 0;
		int odd = 0;
		
	for (int num=1; num <=99;num++) {
		if (num%2==0) {
			even=even+num;
		}else {
			odd= odd+num;
		}
		
		System.out.println("sum of evens= "+even);
		System.out.println("sum of odds= "+odd);
	}

	}

}
