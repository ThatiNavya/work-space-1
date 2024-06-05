package com.car_Engine;


public class DieselEngine implements IEngine {

	@Override
	public int start() {

		System.out.println("DieselEngine Started");
		return 1;
	}

}
