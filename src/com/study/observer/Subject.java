/**
 * 
 */
package com.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangtao
 *
 */
public class Subject {
	protected List<Observer> list=new ArrayList<>();
	public void register(Observer observer){
		list.add(observer);
	}
	public void remove(Observer observer){
		list.remove(observer);
	}
	//通知所有的观察者更新状态
	public void notifyAllObservers(){
		for(Observer obs:list){
			obs.update(this);
		}
	}
}
