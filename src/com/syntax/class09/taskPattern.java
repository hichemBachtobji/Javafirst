package com.syntax.class09;

public class taskPattern {

	public static void main(String[] args) {
		
		//1) print 55555
		//4444
		//333
		//22
		//1
		
		for (int a=5;a>=1;a--) {
			for (int b=1;b<=a;b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//2) print
		/*
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 */
		System.out.println("---2nd task----");
		for (int r=1; r<=5; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r=4; r>=1; r--) {
			for (int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------ 2nd task with if ---------");
		
		for(int a=1;a<=9;a++) {
            if(a<=5) {
                for(int b=1;b<=a;b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for(int b=9;b>=a;b--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}

	}


