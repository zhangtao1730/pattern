/**
 * 
 */
package com.study.bridge;

/**
 * ��������ά��
 * @author zhangtao
 *
 */
public class Computer2 {
	protected Brand brand;
	
	public Computer2(Brand b) {
		this.brand=b;
	}
	public void sale(){
		brand.sale();
	}
}

class Desktop2 extends Computer2{
	
	/**
	 * @param b
	 */
	public Desktop2(Brand b) {
		super(b);
	}
	/* (non-Javadoc)
	 * @see com.study.bridge.Computer2#sale()
	 */
	@Override
	public void sale() {
		super.sale();
		System.out.println("����̨ʽ��");
	}
}
class Laptop2 extends Computer2{
	
	/**
	 * @param b
	 */
	public Laptop2(Brand b) {
		super(b);
	}
	/* (non-Javadoc)
	 * @see com.study.bridge.Computer2#sale()
	 */
	@Override
	public void sale() {
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
}