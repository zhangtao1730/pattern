/**
 * 
 */
package com.study.bridge;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		//��������ıʼǱ�����
		Computer2 c=new Laptop2(new Lenovo());
		c.sale();
	}
}
