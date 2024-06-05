package com.car_Engine;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.eng=new PetrolEngine();
		car.drive();
	}

}
