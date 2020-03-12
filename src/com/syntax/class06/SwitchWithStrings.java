package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		
		/*ask the user where he or she is from
		 * based on the country we will define favorite food
		 * your favorite food is ___
		 */

		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your country ");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "morocco":
			favoriteFood="potato";
			break;
		case "Belarus":
			favoriteFood="potato";
			break;
		case"Tajikistan":
			favoriteFood="Osh";
			break;
		case"Turkey":
			favoriteFood="baklawa";
			break;
		case "Afghanistan":
			favoriteFood="Mantu";
			break;
		
		default:favoriteFood="unkown";
		}	
		
	System.out.println("Your favorite food is "+favoriteFood);	
	}

}
