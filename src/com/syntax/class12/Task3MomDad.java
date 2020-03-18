package com.syntax.class12;

import java.util.Scanner;

public class Task3MomDad {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String MomName;
		String DadName;
		
		boolean boy = true ;
		
		
		System.out.println("Please enter Mom' name");
		MomName=scan.nextLine();
		System.out.println("please enter Dad' name");
		DadName=scan.nextLine();
		
		if (!boy) {
			System.out.println(MomName.substring(0,3)+DadName.substring(3));
		}else {
			System.out.println(DadName.substring(0,3)+MomName.substring(3));
			
		}

		
		System.out.println("---Asel's Work------");
		
		System.out.println("Enter mom's name :");
		String mom = scan.nextLine();
		System.out.println("Enter dad's name:");
		String dad = scan.nextLine();
		System.out.println("Expecting girl or boy:");
		String gender = scan.nextLine();
		if (gender.equals("boy")) {
			String output = dad.substring(0, 3) + mom.charAt(mom.length() - 2)
					+ mom.charAt(mom.length() - 1);
			System.out.println(output.toUpperCase());
		}
		if (gender.equals("girl")) {
			String output = mom.substring(0, 3) + dad.charAt(dad.length() - 2)
					+ dad.charAt(dad.length() - 1);
			System.out.println(output.toUpperCase());
		}
	}

}
