package HichemHomeWork;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
		
		Set<String> countries= new TreeSet<>();
		
		countries.add("Tunisia");
		countries.add("France");
		countries.add("Morroco");
		countries.add("China");
		countries.add("Russia");
		
		System.out.println(countries);
		Iterator<String> itr= countries.iterator();
		while (itr.hasNext()) {
			String obj=itr.next();
			System.out.println(obj);	
		}
		
		for (String c:countries) {
			System.out.println(c);
		}
		System.out.println("----------------------");
		
		Set<String> cities=new HashSet<>();
		cities.add("Tunis");
		cities.add("AParis");
		cities.add("Rabat");
		cities.add("Beijin");
		cities.add("Moscow");
		
		Iterator <String> it=cities.iterator();
		while (it.hasNext()) {
			String element =it.next();
			if(element.startsWith("A")) {
				it.remove();
				
			}
		}
		System.out.println(cities);

	}

	
}
