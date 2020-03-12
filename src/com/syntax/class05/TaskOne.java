package com.syntax.class05;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter your height");
		int height=scan.nextInt();
		
		
		if (height>=0 && height <=6) {
			System.out.println("short");
			
		}else if (height>6 && height <=72) {
			System.out.println("medium");
			
		}else {
			System.out.println("tall");
		}

	}

}
