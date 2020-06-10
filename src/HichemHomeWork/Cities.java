package HichemHomeWork;

import java.util.*;

public class Cities {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new TreeMap<>();
		
		map.put("Paris",5);
		map.put("Tunis",6);
		map.put("DC",7);
		map.put("Madrid",4);
		map.put("Alger",8);
		
		Set<String> list=map.keySet();
		
		for(String l:list) {
			//System.out.print(l+" ");
			if(list.size()>3) {
				//System.out.println(l);
			}
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			if(it.next().contains("a")) {
				it.remove();
			}
		}

		System.out.println(list);
	}

}
