package HichemHomeWork;

import java.util.*;
import java.util.Collection;

class repl198 {
  
  public static void main (String [] args){
    
    Map<Integer, String> map= new TreeMap<>();
    
    map.put(1, "apple");
     map.put(2, "banana");
      map.put(3, "pear");
       map.put(4, "tomato");
        map.put(5, "mango");
         map.put(6, "kiwi");
         
         Set <Integer> set=map.keySet();
         Collection<String> str=map.values();
         
         for (Integer s:set){
        	 
       System.out.println("Key is "+s+" item and values is "+str);
         }
         
  }

}
