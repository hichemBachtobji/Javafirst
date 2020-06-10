package HichemHomeWork;

import java.util.*;

public class repl199 {
	
	public static void main (String [] args){
	    
	    Map <String, Integer> map= new HashMap<>();
	    
	    map.put("mango",10);
	     map.put("apple",30);
	      map.put("orange",20);
	       map.put("mango",40);
	        map.put("mango",40);
	        
	        //Set<String> set=map.keySet();
	        
	        // Collection <Integer> col=map.values();
	        
	        Iterator<String> it= map.keySet().iterator();
	        while(it.hasNext()){
	          String obj=it.next();
	          System.out.println("Key = "+obj+" and value = "+ map.get(obj));
	        }
	        
//	        Iterator <Integer> iter=col.iterator();
//	        while (iter.hasNext()){
//	          int obj1=iter.next();
//	          System.out.println(obj1);
//	         System.out.println(obj + obj1);
//	        }
	        
	    
	    
	    
	  }

}
