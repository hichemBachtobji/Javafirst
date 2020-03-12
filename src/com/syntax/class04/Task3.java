package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		
		System.out.println("how much do you need?");
		
		int price=input.nextInt();
		
		
		if (price>=200000) {
			System.out.println("refused");
			
		}else {
			
			System.out.println("accepted");
		}
		
		

	}

}
