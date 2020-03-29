package com.syntax.class18;

public class Task1 {
	
	Task1(){
		System.out.println("no paramters");
	}
	Task1(String str){
		System.out.println("parameter string: "+str);
	}
public static void main(String[] args) {
	Task1 obj=new Task1();
	Task1 obj1=new Task1 ("Hello");
}
}
