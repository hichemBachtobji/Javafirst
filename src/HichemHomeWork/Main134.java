package HichemHomeWork;

public class Main134 {
	 
	static public String maxLength (String [] arr){
		String str ="";
		int index=0;
	   int length=arr[0].length();
	    for (int i =0;i<arr.length;i++) {
	    	
	    	if (arr[i].length()>length) {
	    		index=i;
	    		length=arr[i].length();
	    	}
	    	str +=length;
	    }
		return arr[index];
	    
	  }
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		

}
