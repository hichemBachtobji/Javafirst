package com.syntax.class18;

public class Task3 {
	
	private Task3() {
		System.out.println("private");
	}
	protected Task3(String str) {
		System.out.println("my String is "+str);
	}
	Task3(int a) {
		System.out.println("my integer is "+a);
	}
	public Task3(char ch) {
		System.out.println("my char is "+ch);
		
	}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		
	}

}
