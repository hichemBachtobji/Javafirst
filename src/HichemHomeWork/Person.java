package HichemHomeWork;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.util.TreeMap;


import com.syntax.class30.EntrySet;

public class Person {
	
	private String name;
	private String lastName;
	private int age;
	private double salary;
	
	public String getName () {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	Person(String name, String lastName, int age, double salary){
		this.name= name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	public void display () {
		System.out.println("user's full name is "+name+" "+lastName+ " his age is "+age+" and his salary is "+salary);
	}

}







