/**
 * 
 */
package com.study.decorator;

/**
 * 抽象组件
 * @author zhangtao
 *
 */
public interface ICar {
	void move();
}

//具体构建对象（被装饰对象）
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
	
}
//装饰器角色
class SuperCar implements ICar{
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
	
}
//具体装饰对象
class FlyCar extends SuperCar{

	/**
	 * @param car
	 */
	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("天上飞！");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}
//具体装饰对象
class WaterCar extends SuperCar{
	
	/**
	 * @param car
	 */
	public WaterCar(ICar car) {
		super(car);
	}
	public void swim(){
		System.out.println("水上游！");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
//具体装饰对象
class AICar extends SuperCar{
	
	/**
	 * @param car
	 */
	public AICar(ICar car) {
		super(car);
	}
	public void autoMove(){
		System.out.println("自动跑！");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}