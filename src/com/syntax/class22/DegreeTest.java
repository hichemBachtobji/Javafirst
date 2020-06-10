package com.syntax.class22;

public class DegreeTest {

	public static void main(String[] args) {
		
		Degree deg=new Degree();
		deg.diploma="high scool diploma";
		String a =deg.getPrerequisite();
		
		Bachelors bac=new Bachelors();
		a=bac.getPrerequisite();
		System.out.println(a);
		
		Masters mas=new Masters();
		mas.diploma="Bachelor degree";
		a=mas.getPrerequisite();

	}

}
