package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer comp=new Apple("Apple");
		comp.durability();
		comp.memory();
		
		System.out.println("-----------------------");
		
		Computer apple=new Apple("Apple");
		Computer lenovo= new Lenovo("Lenovo");
		Computer hp= new HP("HP");
		Computer dell= new Dell("Dell");
		
		Computer [] computers = {new Apple("Apple"),new Lenovo("Lenovo"),hp,dell};
		
		for (Computer c:computers) {
			c.durability();
			c.memory();
			System.out.println("-----------------------");
		}
		System.out.println("-----------------------");
		Apple obj1=new Apple("Apple");
		obj1.camera();

	}

}
