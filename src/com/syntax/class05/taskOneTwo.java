package com.syntax.class05;

import java.util.Scanner;

public class taskOneTwo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("what day of the week is it?");
		int day= scan.nextInt();
		
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("weekday");
			
		}else if (day==6 || day==7){
			System.out.println("weekend");
			
		}else {
			System.out.println("invalid day");
		}

	}

}
