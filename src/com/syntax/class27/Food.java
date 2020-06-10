package com.syntax.class27;

public abstract class Food {
	public String type;
	Food (String Type){
	this.type=type;
	}
	
	abstract void lunch() ;
	abstract void dinner();
	abstract void desert();
		
}
class lasagna extends Food{

	lasagna(String Type) {
		super(Type);
	}

	@Override
	void lunch() {
		System.out.println("I eat "+type+" at Lunch");
		
	}

	@Override
	void dinner() {
		System.out.println("I eat "+type+" at Dinner");
	}

	@Override
	void desert() {
		System.out.println("I eat "+type+" for desert");
	}
	
}
class Pizza extends Food{

	Pizza(String Type) {
		super(Type);
		
	}

	@Override
	void lunch() {
		System.out.println("I eat "+type+" for lunch");
		
	}

	@Override
	void dinner() {
		System.out.println("I eat "+type+" for dinner");
		
	}

	@Override
	void desert() {
		System.out.println("I eat "+type+" for desert");
		
	}
	
}
class iceCream extends Food{

	iceCream(String Type) {
		super(Type);
		
	}

	@Override
	void lunch() {
		System.out.println("I eat "+type+" for desert");
		
	}

	@Override
	void dinner() {
		System.out.println("I eat "+type+" for desert");
		
	}

	@Override
	void desert() {
		System.out.println("I eat "+type+" for desert");
		
	}
	
	
}
