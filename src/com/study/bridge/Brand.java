/**
 * 
 */
package com.study.bridge;

/**
 * Ʒ��
 * @author zhangtao
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("�����������");
	}
	
}

class Dell implements Brand{
	
	@Override
	public void sale() {
		System.out.println("���۴�������");
	}
	
}