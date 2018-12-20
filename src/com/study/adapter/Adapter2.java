package com.study.adapter;
/**
 * ÊÊÅäÆ÷(ÀàÊÊÅäÆ÷·½Ê½)
 * @author zhangtao
 *
 */
public class Adapter2 extends Adaptee implements Target{

	
	@Override
	public void handleReq() {
		super.request();
	}

}
