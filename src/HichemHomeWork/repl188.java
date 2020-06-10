package HichemHomeWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class repl188 {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
//		countries.remove(0);
//		countries.remove(2);
//		countries.remove(4);
//		
//		System.out.println(countries);

		Iterator <String> it=countries.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("A")) {
				it.remove();
			}
			System.out.println(countries);
		}
		}
	}


