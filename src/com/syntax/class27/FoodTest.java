package com.syntax.class27;

import java.util.ArrayList;

public class FoodTest {

	public static void main(String[] args) {
		ArrayList<Food> arr=new ArrayList<>();
		arr.add(new lasagna("lasagna"));
		arr.add(new Pizza("Pizza"));
		arr.add(new iceCream("ice cream"));
		
		for (Food f:arr) {
			f.lunch();
			f.dinner();
			f.desert();
		}
		
		System.out.println("-------------------------");
		for (int i=0;i<arr.size();i++) {
			
			arr.get(i).lunch();
			arr.get(i).dinner();
			arr.get(i).desert();
		}
		
		System.out.println("-------------------------");

	}

}
