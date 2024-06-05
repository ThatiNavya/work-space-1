package com.autowiring;

public class Car {

	public Car() {
		System.out.println("Car::Constructor");
	}

	/*
	 * private PetrolEngine petrolEngine;
	 * 
	 * public Car(PetrolEngine petrolEngine){ this.petrolEngine=petrolEngine;
	 * 
	 * }
	 */

	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}
	
	private DieselEngine dieselEngine;
	public void drive() {
		int result = dieselEngine.start();
		if(result>=1) {
			System.out.println("Car Started for journey");
		}
		else {
			System.out.println("Engine has Some Problem");
		}
	}
}
