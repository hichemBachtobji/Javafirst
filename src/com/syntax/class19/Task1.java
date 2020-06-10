package com.syntax.class19;

public class Task1 {
	
	String str;
	int num=2;
	
	Task1(){
		
		System.out.println(str);
	}

	Task1(String str){
		System.out.println("I have "+num+" "+str);
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		
	}
}
