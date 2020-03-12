package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		/*Ask user a gender :M or F
		 * based on the gender will provide description
		 */

		Scanner scan;
		char gender;
		String genderType;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter gender:Mor F");
		gender=scan.next().charAt(0);
		
		switch(gender) {
		
		case'M':
			genderType="male";
			break;
		case'F':
			genderType="Female";
			break;
			default:
				genderType="unkown";
		
		}
		System.out.println("your gender is "+genderType);
	}

}
