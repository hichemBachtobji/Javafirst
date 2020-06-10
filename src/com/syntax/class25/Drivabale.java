package com.syntax.class25;

public interface Drivabale {
	
	//compiler by default adds public static final 
		boolean MOVE_FAST=true;
		
		//compiler by default adds public abstract 
		void drive();
	}

	abstract class Vehicles{
		
		abstract void stop();
	}
	//achieving multiple inheritance
	class Cars extends Vehicles implements Drivabale {

		@Override
		public void drive() {
			System.out.println("Car drives");
		}

		@Override
		void stop() {
			System.out.println("Car stops");
		}

}
