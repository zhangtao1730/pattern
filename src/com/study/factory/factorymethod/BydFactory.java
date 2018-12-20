package com.study.factory.factorymethod;

public class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Byd();
	}

}
