package HichemHomeWork;

import java.util.*;

public class CollectionIntegerSum {

	public static void main(String[] args) {
	
		List<Integer> list= new LinkedList<>();
		
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		
		
	
		int sum=0;
		for (Integer l:list) {
			
			sum+=l;
			
		}
		System.out.println(sum);
	}

}
