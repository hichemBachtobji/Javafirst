package HichemHomeWork;

import java.util.*;

public class repl205 {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> dataList= new ArrayList<>();
		
		Map<String,Object> apple=new HashMap<>();
		apple.put("Items", "Apple");
		apple.put("Price", 20.00);
		apple.put("Quantity", 10);
		
		dataList.add(apple);
		
		Map<String , Object> orange= new HashMap<>();
		
		orange.put("Items", "Orange");
		orange.put("Price", 21.99);
		orange.put("Quantity", 10);
		
		dataList.add(orange);
		double total=0;
		for (Map<String, Object> map:dataList) {
			String items= map.get("Items").toString();
			double price = Double.parseDouble(map.get("Price").toString());
			double quantity=Double.parseDouble(map.get("Quantity").toString());
			double lineTotal= price * quantity;
			System.out.println("Items: "+items+" Price "+price+" Quantity "+quantity +" SubTotal "+lineTotal);
			total+=lineTotal;
		}
		System.out.println(total);
		
		
	}

}
