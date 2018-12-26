/**
 * 
 */
package com.study.strategy;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		Strategy s1=new OleCustomerManyStrategy();
		Context ctx=new Context(s1);
		ctx.printPrice(998);
	}
}
