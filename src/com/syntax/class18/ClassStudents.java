package com.syntax.class18;

public class ClassStudents {
	
	String StudentName;
	int grade1;
	int grade2;
	int grade3;
	
	ClassStudents(String name, int grd1, int grd2, int grd3){
		StudentName=name;
		grade1=grd1;
		grade2=grd2;
		grade3=grd3;
		
	}
	
	int average(int [] array) {
		int total=0;
		total=grade1+grade2+grade3;
		int avrg=total/3;
		return avrg;
		
		
	}
	public static void main(String[] args) {
		ClassStudents obj=new ClassStudents("Hichem",10,20,30);
		System.out.println();
		ClassStudents obj1=new ClassStudents("Asel",100,200,300);
		
		ClassStudents obj2=new ClassStudents("Elion",1000,2000,3000);
		
		
	}
}
