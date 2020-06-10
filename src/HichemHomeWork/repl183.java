package HichemHomeWork;

import java.util.*;
//import java.util.LinkedList;

public class repl183 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i=50;i<100;i++) {
			list.add(i);
		}
		//System.out.println(list);
		for (Integer l:list) {
			if(l %3 ==0) {
				System.out.println(l+" ");
			}
		}
			for(int i=50;i<100;i++) {
				if(i %3==0) {
					System.out.println(list);
				}
			}
			Iterator<Integer> it=list.iterator();
			while (it.hasNext()) {
				if(it.next()%3 !=0) {
				it.remove();
				
				}	
				
			}
			System.out.println(list);
	
}
}		
		
		
//		for (int i = 50; i < 100; i++) {
//			list.add(i);
//		}
//
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			if (it.next() % 3 != 0) {
//				it.remove();
//				;
//			}
//		}
//		System.out.println(list);
//	}
//}
