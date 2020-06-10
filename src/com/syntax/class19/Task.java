package com.syntax.class19;

public class Task {
	
	String name, address;
	
	public Task (String name, String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println(name);
		System.out.println(address);
	}
	public static void main (String []args) {
		Task obj=new Task("Hichem","DC NW");
		obj.displayInfo();
	}

}
