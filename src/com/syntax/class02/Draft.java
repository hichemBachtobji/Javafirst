package com.syntax.class02;

import java.util.Scanner;

public class Draft {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
//		String[] days = new String[7];
//
//		
//		for (int count = 0; count <=days.length ; count++) {
//			
//			System.out.println("Enter day " + (count+1) + " of the week");
//			String day = input.next();
//			days[count] = day;
//
//		}
//		for (String day:days) {
//			System.out.println(day);
//	}
//		
		String[] days=new String [7];
        for(int x=0;x<days.length;x++) {
          System.out.println("Please enter day "+(x+1)+" of the week") ;
          String day=input.next();
          days[x]=day;
        }
        for(String day:days) {
            System.out.println(day);
	}
	}
}
