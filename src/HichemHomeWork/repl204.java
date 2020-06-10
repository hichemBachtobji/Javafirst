package HichemHomeWork;

import java.util.HashMap;
import java.util.Map;

public class repl204 {
	
	public static void display (Map<String , Integer> map) {
		
		if(map.isEmpty()) {
		System.out.println("map is empty");
		}else {
			for(String key:map.keySet()) {
				System.out.println(key+" : "+map.get(key));
			}
		}
		
	}

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		display(map);
		map.clear();
		display(map);
		

	}

}
