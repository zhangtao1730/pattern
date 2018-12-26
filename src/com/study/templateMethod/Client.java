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
		//采用匿名内部类
		BankTempateMethod btm2=new BankTempateMethod(){
			@Override
			public void transact() {
				System.out.println("我要存钱");
			}
		};
		btm2.process();
		BankTempateMethod btm3=new BankTempateMethod(){

			@Override
			public void transact() {
				System.out.println("我要理财");
			}
			
		};
		btm3.process();
	}
}

class DrawMoney extends BankTempateMethod{
	@Override
	public void transact() {
		System.out.println("我要取款");		
	}
}