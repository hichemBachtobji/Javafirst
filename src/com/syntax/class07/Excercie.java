package com.syntax.class07;

public class Excercie {

	public static void main(String[] args) {
		
		int num5=50;
		
		while (num5>=1) {
			System.out.println(num5);
			num5--;
		}
		System.out.println("--------------------------");
// 2nd way: using mod and if condition
		int num4= 1;
		while (num4 <=20) {
			
			if (num4 %2 !=0) {
				System.out.println(num4);
				
			}
			num4++;
		}
		System.out.println("-----------------------");
		//3rd way:
		int y=1;
		while(y<=20) {
			
			System.out.println(y++);
			y++;
		}
		
		
		
		
	}

}
