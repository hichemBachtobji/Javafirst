package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		// to print number from 50 to 1
		
		for (int a=50; a>=1; a--) {
			
			System.out.println(a);
		}
		
		System.out.println("------print odd numbers------");
//print odd numbers between 20 and 50
		
		for(int a= 20; a<=50;a++) {
			
			if (a%2!=0) {
				System.out.println(a);
			}
		}
		System.out.println("------odd numbers---------");
		for (int a =21; a<=50;a+=2) {
			System.out.println(a);
		}
		System.out.println("----total-----");
		
		int total=2;
		for(int k=1;k<4;k++) {
			total=total*k;
					System.out.println(total);
		}
		System.out.println("final price="+total);
	}

}
