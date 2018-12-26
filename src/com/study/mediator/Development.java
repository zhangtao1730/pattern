/**
 * 
 */
package com.study.mediator;

/**
 * @author zhangtao
 *
 */
public class Development implements Department{
	private Mediator m;//�����н���(�ܾ���)������
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("ר�Ŀ��У�������Ŀ��");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨������ûǮ�ˣ���Ҫ�ʽ�֧�֣�");
	}
	
}
