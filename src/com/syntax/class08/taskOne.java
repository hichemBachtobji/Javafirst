package com.syntax.class08;

import java.util.Scanner;

public class taskOne {

	public static void main(String[] args) {
		// Print numbers
		//from 1 to 50 except those that are divisible by 3
		for (int a=1; a<=50; a++ ) {
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
		}
System.out.println("-------------------------------------");
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an “yes” from a user program should stop asking.
		Scanner scan=new Scanner (System.in);
		System.out.println("please apply for credit card");
		String cc;
		cc=scan.nextLine();
		String b = null;
		
		
		for (int num=1;num<10;num++) {
			System.out.println("please apply for credit card");
			cc=scan.nextLine();
			if (cc.equals("yes")) {
			System.out.println("stop asking");	
				break;
			}
			
		}
		
		
	}

}
