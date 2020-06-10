package com.syntax.class20;

public class ScrumTeam1 extends Employee1{
	
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("Scrum Team attends "+ceremonies);
	}

	public class Tester extends ScrumTeam1{
		
		void test() {
			System.out.println("Testers");
		}
	}
	
	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.empNumber=333;
		emp.salary=22.33;
		emp.company="Synatx";
		
		emp.getPaid();
		emp.work();
		System.out.println("---------------------");
		ScrumTeam1 scrum=new ScrumTeam1();
		scrum.ceremonies="sprint grooming, sprint planning, sprint Demo";
		scrum.attendMeetings();
	}
}

