package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		
		// we want to ask user's name and print Good Afternnon___;
		
		Scanner input;
		String name;
		int num=1;
		
		
		
		input=new Scanner (System.in);
		
		while(num<=5) {
		
		System.out.println(" what is your name? ");
		name=input.nextLine();
		
		System.out.println("Good afternoon "+name);
		num++;
		}
		
		//we are playing a lottery and a lucky number is 17;
		//we want to ask the user any number from 1-20 until he guess the lucky number
		//-->congrats
		
		int luckyNumber=17;
		int number = 0;
		
		
		
		while(number>=20) {
			System.out.println("what's your number?");
			number=input.nextInt();
			System.out.println("lucky number is "+luckyNumber);
			number++;
			
			
		}
		
		
		
		
	}

}
