package com.syntax.class15;

public class Methods {
	
	// create a method that will say welcome 10 times
	
	void sayWelcome() {
		
		for (int i=0;i<10;i++) {
			System.out.println("Welcome");
		}
	}

	void sayAnything (String word, int times) {
		for (int i=1;i<times;i++) {
			System.out.println(word);
		}
		
	}
}
