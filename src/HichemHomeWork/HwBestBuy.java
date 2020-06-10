package HichemHomeWork;


import java.util.*;
import java.util.Map.Entry;

public class HwBestBuy {

	public static void main(String[] args) {
		
		Map <Integer, String> BestBuy=new HashMap <> ();
		
		BestBuy.put(1, "Printer");
		BestBuy.put(2,"TV");
		BestBuy.put(3, "PC");
		BestBuy.put(4, "Phones");
		
		Set<Entry<Integer, String>> items=BestBuy.entrySet();
		System.out.println(items);
		
		Iterator<Entry<Integer, String>> it =items.iterator();
		while(it.hasNext()) {
			
		}
		

	}

}
