package com.syntax.class17;

public class Employee {
	
	// creating variables to hold :name, last name, title, son
	
	public static String title;
	
	public String name;// accessible everywhere
	protected String lastName;// accessible within same package
	double salary;// accessible within same package
	private long ssn;// accessible only within same class
	
	public void method1() {
		System.out.println("I am public method ");
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am default method");
	}private void method4() {
		System.out.println("I am a private method");
	}
	public static void main (String [] args) {
		
		Employee emp= new Employee ();
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
	}

}
