package com.study.factory.abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
	
}

class LowSeat implements Seat{
	
	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
	
}