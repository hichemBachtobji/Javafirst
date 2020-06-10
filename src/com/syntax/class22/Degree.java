package com.syntax.class22;

public class Degree {
	String diploma;


	public String getPrerequisite() {
		this.diploma=diploma;
		System.out.println("To get a degree you need "+diploma);
		return diploma;
	}
}
class Bachelors extends Degree{
	public String getPrerequisite() {
		return diploma;
		
	}
	
	
}
class Masters extends Degree{
	String diploma;
	public String getPrerequisite() {
		this.diploma=diploma;
		System.out.println("To get a degree you need "+diploma);
		return diploma;
	}
	
}