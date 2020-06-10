package HichemHomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class repl208 {
	 public static void method(String filePath) throws FileNotFoundException {
		    
		    FileInputStream fis= new FileInputStream(filePath);
		  }
		  
		  
		  public static void main(String [] args){
		    
		    try {
				method("");
			} catch (FileNotFoundException e) {
				
				//e.printStackTrace();
				System.out.println(e);
			}
		  
		    
		  }

}
