package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		//Capture name for a user
				//print in the format
				//my name is____
				//1. Bring Scanner class into program
				// System.in --> identifies keyboard
				Scanner scan=new Scanner(System.in);
				// Instruct user of what program expects
				System.out.println("Please entre your name");
				// Capture line from string to user
				String name=scan.nextLine();
				System.out.println("My name is "+ name);
				// Instruct user of what program expects
				System.out.println("How old are you?");
				// Capture number from user
				int age=scan.nextInt();
				System.out.println("Your name is "+name+" your age is "+age);
	}

}
