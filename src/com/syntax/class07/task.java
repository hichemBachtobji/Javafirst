package com.syntax.class07;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
	
		
		
		//we are playing a lottery and a lucky number is 17;
		//we want to ask the user any number from 1-20 until he guess the lucky number
		//-->congrats
		
		
		int number = 1;
		Scanner scan=new Scanner(System.in);
		
		
		while(number!=17) {
			System.out.println("what's your number?");
			number=scan.nextInt();
			if(number<1 ||number>20 ) {
				System.out.println("invalid");
			}if(number==17) {
				System.out.println("congrats");
			}
			
			
			
			
		}
		
		
		
		
		

	}

}
