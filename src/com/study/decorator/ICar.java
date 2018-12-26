/**
 * 
 */
package com.study.decorator;

/**
 * �������
 * @author zhangtao
 *
 */
public interface ICar {
	void move();
}

//���幹�����󣨱�װ�ζ���
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("½������");
	}
	
}
//װ������ɫ
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
//����װ�ζ���
class FlyCar extends SuperCar{

	/**
	 * @param car
	 */
	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("���Ϸɣ�");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}
//����װ�ζ���
class WaterCar extends SuperCar{
	
	/**
	 * @param car
	 */
	public WaterCar(ICar car) {
		super(car);
	}
	public void swim(){
		System.out.println("ˮ���Σ�");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
//����װ�ζ���
class AICar extends SuperCar{
	
	/**
	 * @param car
	 */
	public AICar(ICar car) {
		super(car);
	}
	public void autoMove(){
		System.out.println("�Զ��ܣ�");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}