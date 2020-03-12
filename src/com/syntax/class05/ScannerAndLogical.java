package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		
		/*you are a salesman
		 * ask a user how much his sales are
		 * based on the amount of sales we need to calculate his commission
		 * if sales is between 1-100--> commission should be 10%
		 * if sales is between 100-200--> commission sould be 20%
		 * if sales is between 200-500--> commission sould be 30%
		 * if sales more than 500-->commission sould be 50%
		 */
		
		// if your sales are 200-->40
		
//1. declare all variable that I will need
		
		double sales;
		double commission;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your sales amount");
		
		sales=scan.nextDouble();
		
		if (sales>=1 && sales <=100) {
			// give user 10% commission
			commission =sales*0.1;
		}else if(sales>100 && sales<=200) {
			// give user 20% commission
			commission=sales*0.2;
			
		}else if (sales>200 && sales<=500) {
			//give user 30%
			commission=sales*0.3;
			
		}else {
			
			commission=sales*0.5;
		}
		
		
		
	}

}
