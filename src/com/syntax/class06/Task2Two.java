package com.syntax.class06;

import java.util.Scanner;

public class Task2Two {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide explanation: 
		 * A-Excellent,
		 *  B-Good, 
		 *  C-Average,
		 *   D-Bad, 
		 *   any other grade --> Not Acceptable.
		 */
		//At the end your program should print which grade was entered by a user with explanation.

		Scanner scan;
		String explanation;
		char grade;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter grade: ");
		grade=scan.next().charAt(0);
		
		switch (grade) {
		
		case 'A': 
			explanation="Excellent";
			break;
			
		case 'B':
			explanation="Good";
			break;
			
		case 'C':
			explanation="average";
			break;
			
		case 'D':
			explanation="bad";
			break;
			
			default :explanation="not acceptable";
			
		
		}
		System.out.println("grade "+grade+" explanation "+explanation);
	}

}
