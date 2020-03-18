package com.syntax.class12;

public class TaskSplit {

	public static void main(String[] args) {
		String str="I have a Java class";
		
		
			String[] array=str.split(" ");
		for (String arr:array) {
			System.out.print(arr);
		}
		System.out.println();
		
		System.out.println("--2--");
		
		String str1="I have a Java class 1234$%^&";
		System.out.println(str1.length());
		
		System.out.println("---3---");
		
		String a="Is it Saturday? is it raining? Do we have a Java Class today?";
		String [] array1=a.split("?");
		for (String arr1:array1) {
			System.out.println(arr1);
		}
		}
		}
	

	
		
		
	


