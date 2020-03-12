package com.syntax.class09;

public class moreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		
		String[]students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
	//	students[3]="aaron";--> during run time java machine will give 
		// java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(students[2]);
		
		System.out.println("------------------------");
		
		String[] inClassStudents= new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		
		System.out.println(inClassStudents[0]);

	}

}
