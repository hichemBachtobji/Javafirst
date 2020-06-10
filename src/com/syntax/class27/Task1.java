package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;



public class Task1 {
	
	//Create an arraylist of cars and retrieve all the values using 3 different ways.

    //Create an arrayList of words. Remove every word that ends with “e”. Use iterator
	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Toyota");
		cars.isEmpty();
		
		for (Object o:cars) {
			System.out.println(o);
		}
		for (int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		Iterator <String> it=cars. iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
