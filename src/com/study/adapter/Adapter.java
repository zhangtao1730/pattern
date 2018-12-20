package com.study.adapter;
/**
 * 适配器(对象适配器方式，使用组合的方式跟被适配对象整合)
 * @author zhangtao
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}
