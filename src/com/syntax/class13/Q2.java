package com.syntax.class13;

public class Q2 {

	public static void main(String[] args) {
	//prime number:
		//should be divisible by one and itself only
		//should be >1
		int given=10;
		boolean isPrime=true;
		
		if (given>1) {
			for(int i=2; i<given;i++) {
				isPrime=false;
				break;
			}
			
		}else {
			isPrime=false;
		}

		System.out.println("given number "+given+" is prime "+isPrime);
	}

}
