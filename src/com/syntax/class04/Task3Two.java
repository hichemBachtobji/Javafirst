package com.syntax.class04;

import java.util.Scanner;

public class Task3Two {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("how old are you?");
		
		int age=input.nextInt();
		
		if (age>18) {
			System.out.println("you can pass your driver's license");
		}else {
			System.out.println("not eligible to pass your driver's license");
		}
		

	}

}
