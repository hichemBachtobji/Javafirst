package HichemHomeWork;

import java.util.*;

public class TaskMap {

	public static void main(String[] args) {
		
		Map<String, String> country=new TreeMap<>();
		
		country.put("tunisia", "Tunis");
		country.put("France", "Paris");
		country.put("USA", "DC");
		
		System.out.println(country);
		
		for (String c:country.keySet()) {
			System.out.println(c);
		}
		Iterator<String> it=country.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String cap:country.values()) {
			System.out.println(cap);
		}
	}

}
