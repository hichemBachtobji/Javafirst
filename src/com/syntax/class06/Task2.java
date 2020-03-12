package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks.
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		switch (country) {
		
		case "Tunisia":
			language="tunisian";
			break;
			
		case"France":
			language="french";
			break;
		case"USA":
			language="english";
			break;
			
		default :
			language="unknown";
		
		}
		System.out.println("your country speaks "+language);

	}

}
