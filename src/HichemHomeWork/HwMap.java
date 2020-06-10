package HichemHomeWork;

import java.util.*;

public class HwMap {

	public static void main(String[] args) {
		
		Map<Integer, String> building =new LinkedHashMap<>();

		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Apple");
		building.put(4, "Facebook");
		building.put(5, "Amazon");
		building.put(6, "Samsung");
		building.put(7, "Uber");
		
		System.out.println(building);
		
		System.out.println(building.size());
		
		building.replace(4, "Facebook", "Instagram");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		Set <Integer> keys=building.keySet();
		
		System.out.println("-------Iterator-------");
		
		
	}

}
