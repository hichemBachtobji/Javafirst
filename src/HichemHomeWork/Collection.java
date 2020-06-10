package HichemHomeWork;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
		Set<String> obj= new LinkedHashSet<>();
		
		obj.add("john");
		obj.add("tom");
		obj.add("tom");
		obj.add("hich");
		obj.add("omar");
		obj.add("john");
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" + ");
			
		}
			
		}
	

}
