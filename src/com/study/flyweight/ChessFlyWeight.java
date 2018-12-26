/**
 * 
 */
package com.study.flyweight;

/**
 * 享元类
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
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置："+c.getX()+"---"+c.getY());
	}
	
}