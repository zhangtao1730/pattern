package com.study.adapter;
/**
 * ������(����������ʽ)
 * @author zhangtao
 *
 */
public class Adapter2 extends Adaptee implements Target{

	
	@Override
	public void handleReq() {
		super.request();
	}

}
