package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
//How would handle InputMismatchException?
		//Input Mismatch Exception when user enters mismatch value then programmer expected.
		//Create a static method that will return a List of Exceptions.
		//Inside your method create objects of 4 exception classes using try and catch blocks
		//and store them inside your list.

public class Task1 {
	
		public static List <Exception> exception(){
			List<Exception> list= new ArrayList<>();
			
			int a=10;
			int b=0;
			try {
				System.out.println(a/b);
			}catch(ArithmeticException ae){
				list.add(ae);
				System.out.println(ae.getMessage());
			}
			String filePath="";
			
			try {
				FileInputStream fis= new FileInputStream(filePath);
				
			}catch(Exception fne) {
				list.add(fne);
				//fne.printStackTrace();
				System.out.println(fne.getMessage());
			}
			
			String str= "Hello";
			
			try {
				char character= str.charAt(10);
			}catch(Exception ce) {
				list.add(ce);
				System.out.println(ce.getMessage());
			}
			
			return list;
		
			
		}
			
		public static void main(String[] args) {
			exception();
		}
		
     }

