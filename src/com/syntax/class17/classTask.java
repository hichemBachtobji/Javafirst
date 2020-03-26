package com.syntax.class17;

public class classTask {
	
	// Task-1
		/*Create a method that will accept an array as parameters and will return a sum
		 * of all elements from that array. Method should be visibly only within same
		 * package and accessible by the creating an instance of the class.
	 	 */
		static int array(int [] x) {
			int sum=0;
			for (int i=0;i<x.length;i++) {
				sum=sum+x[i];
			}
			return sum;
		}
		public static void main(String[] args) {
			
			classTask task1=new classTask();
			
			int[] y= {10,12,13,15};
			int arr=task1.array(y);
			System.out.println("Sum of all array element is: "+arr);
		}


}
