package com.syntax.class06;

import java.util.Scanner;

public class TaskTwoOne {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birthday month");
		String month=scan.nextLine();
		if (month.equals("January") || month.equals("Ferbuary") || month.equals("December")) {
			System.out.println("You were born in winter");
		}else if (month.equals("September") || month.equals("October") || month.equals("November")){
			System.out.println("You were born in autumn");
		}else if (month.equals("June") || month.equals("July") || month.equals("August")){
			System.out.println("You were born in summer");
		}else if (month.equals("March") || month.equals("April") || month.equals("May")){
			System.out.println("You were born in spring");
		}else {
			System.out.println("Invalid month");
		}
	}
}
	
// a refaire
