package HichemHomeWork;

import java.util.*;

public class repl185 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> listA = new ArrayList<>();
		
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList<Boolean> listB=new ArrayList<>(listA);
		listB.addAll(listA);
		
		Iterator<Boolean> it=listB.iterator();
		
		while(it.hasNext()) {
			boolean a=it.next();
			System.out.println(a);
		}

	}

}
