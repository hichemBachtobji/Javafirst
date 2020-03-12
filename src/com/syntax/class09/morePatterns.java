package com.syntax.class09;

public class morePatterns {

	public static void main(String[] args) {
		
		/*
		 * 12345
         * 12345
		 * 12345
		 * 12345
	 */
		
		for (int i=1; i<5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/* 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		for (int i=1; i<5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
System.out.println("-- PRINTING 5 ROWS OF 1-9-----");
for (int a=1;a<=5;a++) {
	for(int b=1;b<=9;b++) {
		System.out.print(b);
	}
	System.out.println();
}

System.out.println("---printing 5 4 3 2 1 5times-----");

for (int a=1;a<=5;a++) {
	for (int b=5;b>=1;b--) {
		System.out.print(b);
	}
	System.out.println();
}

	}

}
