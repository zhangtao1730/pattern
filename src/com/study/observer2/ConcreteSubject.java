/**
 * 
 */
package com.study.observer2;

import java.util.Observable;

/**
 * 目标对象
 * @author zhangtao
 *
 */
public class ConcreteSubject extends Observable{
	private int state;
	public void set(int s){
		state=s;
		setChanged();//表示目标对象已经做了更改
		notifyObservers(state);//通知所有的观察者
	}
	public int getState() {
		return state;
	}
}
