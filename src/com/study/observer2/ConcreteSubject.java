/**
 * 
 */
package com.study.observer2;

import java.util.Observable;

/**
 * Ŀ�����
 * @author zhangtao
 *
 */
public class ConcreteSubject extends Observable{
	private int state;
	public void set(int s){
		state=s;
		setChanged();//��ʾĿ������Ѿ����˸���
		notifyObservers(state);//֪ͨ���еĹ۲���
	}
	public int getState() {
		return state;
	}
}
