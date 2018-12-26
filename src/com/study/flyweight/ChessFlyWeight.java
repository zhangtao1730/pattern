/**
 * 
 */
package com.study.flyweight;

/**
 * ��Ԫ��
 * @author zhangtao
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{
	private String color;
	@Override
	public void setColor(String c) {
		this.color=c;
	}
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}
	@Override
	public String getColor() {
		return color;
	}

	public void display(Coordinate c) {
		System.out.println("������ɫ��"+color);
		System.out.println("����λ�ã�"+c.getX()+"---"+c.getY());
	}
	
}