package com.syntax.class08;

import java.util.Scanner;

public class loopReview {

	public static void main(String[] args) {
		
		/*ask user to pay for a candy
		 * as long as the entered price is not 2$
		 * we need to keep ask for paying
		 * once amount is correct --> enjoy your candy
		 */
		
		Scanner scan;
		double price;
		scan = new Scanner (System.in);
		
		do {
			
			System.out.println("Please pay for a candy");
price = scan.nextDouble();
			
		}while (price !=2);
		
		System.out.println("enjoy your candy");
		
		System.out.println("_________________________________________________________");
		
		System.out.println("please pay for your soda");
		price=scan.nextDouble();
		while (price!=2) {
			
			System.out.println("please pay for your soda");
			price=scan.nextDouble();
		}
System.out.println("enjoy your soda");
	}

}
