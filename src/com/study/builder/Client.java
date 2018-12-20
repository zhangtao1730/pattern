package com.study.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director=new StudyAirShipDirector(new StudyAirShipBuilder());
		AirShip ship=director.directAirShip();
		System.out.println(ship.getEscapeTower().getName());
		ship.launch();
	}
}
