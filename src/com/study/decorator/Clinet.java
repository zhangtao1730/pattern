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
		System.out.println("�����µĹ��ܣ�����-------------");
		FlyCar flyCar =new FlyCar(car);
		flyCar.move();
		System.out.println("�����µĹ��ܣ�ˮ����-------------");
		WaterCar waterCar =new WaterCar(flyCar);
		waterCar.move();
	}
}
