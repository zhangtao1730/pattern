package com.study.factory.simplefactory;
/**
 * �򵥹�����
 * @author zhangtao
 *
 */
public class CarFactory2 {
	public static Car createAudi(){
		return new Audi();
	}
	public static Car creadByd(){
		return new Byd();
	}
}
