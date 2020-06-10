package com.syntax.class20;

public class Employee1 {

	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee earns "+salary);
	}
	static void work() {
		System.out.println("Employee works in "+company);
	}
	
}
