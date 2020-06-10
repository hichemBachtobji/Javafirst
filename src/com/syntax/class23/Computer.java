package com.syntax.class23;

public class Computer {
	
	String make;
	
	public Computer(String make) {
		this.make=make;
	}
	
	public void durability() {
		
		System.out.println(make+" is durable");
	}
	
	public void memory() {
		System.out.println(make +" has memory");
	}

}
class Apple extends Computer{
	
	Apple(String make){
		super (make);
	}
	
	public void durability() {
		System.out.println(make+" is more durable");
	}
	
	public void memory() {
		System.out.println(make+" has more memory");
	}
	public void camera() {
		System.out.println(make + " has a high definition camera");
	}
}

class Lenovo extends Computer{
	
	Lenovo (String make){
		super (make);
	}
	public void durability() {
		System.out.println(make+" is less durable");
	}
	
	public void memory() {
		System.out.println(make+" has less memory");
	}
	
	public void grantee() {
		System.out.println(make + " has garantee");
}
}
class HP extends Computer{
	
	HP (String make){
		super (make);
	}
	
	public void durability() {
		System.out.println(make+" is medium durable");
	}
	
	public void memory() {
		System.out.println(make+" has medium memory");
}
	public void charge () {
		System.out.println(make + " has all day charging");
}
	
}

class Dell extends Computer{
	
	Dell (String make){
		super (make);
	}
	
	public void durability() {
		System.out.println(make+"is less durable");
	}
	
	public void memory(String make) {
		System.out.println(make+" has less memory");
	}
	
	public void gaming (String make) {
		System.out.println(make + " is good for gaming");
}
}