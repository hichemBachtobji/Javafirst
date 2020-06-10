package HichemHomeWork;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Map <Integer, Person> map=new TreeMap<>();
		
		map.put(1, new Person("Hichem", "bach", 30, 1000.0));
		map.put(3, new Person("Adam", "berrahal", 3, 2000.0));
		map.put(4, new Person("Hela", "bachtobji", 43, 3000.0));
		map.put(2, new Person("faouzia", "harabi", 70, 1000.0));
		
		
		
		//System.out.println(map);
		
		Collection <Person> list= map.values();
		
	
		for (Person l:list) {
			l.display();
			System.out.println(l);
			System.out.println("___________________");
		}
		
		
		Set<Entry<Integer, Person>> entry=map.entrySet();
		
		for (Entry<Integer, Person> e:entry) {
		e.getValue().display();
		
		System.out.println("____________________");
		}
		
		Set<Integer> key=map.keySet();
		
		for (Integer k:key) {
			Person obj=map.get(k);
			obj.display();
		}
		
	}
	
}
