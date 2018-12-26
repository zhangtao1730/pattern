/**
 * 
 */
package com.study.mediator;

/**
 * @author zhangtao
 *
 */
public class Finacial implements Department{
	private Mediator m;//�����н���(�ܾ���)������
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("��Ǯ��");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨������Ǯ̫���ˣ���ô����");
	}
	
}
