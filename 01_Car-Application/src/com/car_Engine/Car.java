package com.car_Engine;

public class Car {

	IEngine eng;

	public void drive() {

		int status = eng.start();

		if (status >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine  Trouble...");
		}

	}
}
