package com.study.adapter;
/**
 * ������(������������ʽ��ʹ����ϵķ�ʽ���������������)
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
