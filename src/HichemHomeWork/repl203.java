package HichemHomeWork;

import java.util.*;
import java.util.Map.Entry;
 
class repl203 {
  
  public static void main (String [] args){
    Map <String, String> map=new HashMap<>();
    
    map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Set<Entry<String, String>> entries= map.entrySet();

Iterator<Entry<String, String>> it= entries.iterator();

System.out.println("HashMap Before Replace :");
while(it.hasNext()) {
	
	Entry entry =it.next();
	Object val=entry.getValue();
	Object key=entry.getKey();
	
	System.out.println(key+" : "+val);
}

map.replace("THREE", "ASEL");
map.replace("FIVE", "SUMAIR");

Set<Entry<String,String>> entries2= map.entrySet();

Iterator <Entry<String, String >> it2=entries2.iterator();

System.out.println("HashMap After Replace :");
while(it2.hasNext()) {
	
	Entry<String, String> entry1=it2.next();
	
	System.out.println(entry1.getKey()+" : "+entry1.getValue());
}
    
  }
 
}


