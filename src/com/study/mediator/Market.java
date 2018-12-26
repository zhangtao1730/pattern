/**
 * 
 */
package com.study.mediator;

/**
 * @author zhangtao
 *
 */
public class Market implements Department{
	private Mediator m;//�����н���(�ܾ���)������
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("����Ŀ��");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨��������Ŀ�нӵĽ��ȣ���Ҫ�ʽ�֧��");
		m.command("finacial");
	}
	
}
