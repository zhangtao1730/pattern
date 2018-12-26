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
	//֪ͨ���еĹ۲��߸���״̬
	public void notifyAllObservers(){
		for(Observer obs:list){
			obs.update(this);
		}
	}
}
