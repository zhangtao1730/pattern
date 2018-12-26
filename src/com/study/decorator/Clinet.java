/**
 * 
 */
package com.study.decorator;

/**
 * @author zhangtao
 *
 */
public class Clinet {
	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		System.out.println("增加新的功能：飞行-------------");
		FlyCar flyCar =new FlyCar(car);
		flyCar.move();
		System.out.println("增加新的功能：水里游-------------");
		WaterCar waterCar =new WaterCar(flyCar);
		waterCar.move();
	}
}
