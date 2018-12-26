/**
 * 
 */
package com.study.templateMethod;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		BankTempateMethod btm=new DrawMoney();
		btm.process();
		//���������ڲ���
		BankTempateMethod btm2=new BankTempateMethod(){
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ");
			}
		};
		btm2.process();
		BankTempateMethod btm3=new BankTempateMethod(){

			@Override
			public void transact() {
				System.out.println("��Ҫ���");
			}
			
		};
		btm3.process();
	}
}

class DrawMoney extends BankTempateMethod{
	@Override
	public void transact() {
		System.out.println("��Ҫȡ��");		
	}
}