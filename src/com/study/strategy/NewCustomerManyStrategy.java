/**
 * 
 */
package com.study.strategy;

/**
 * @author zhangtao
 *
 */
public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�����");
		return standardPrice*0.9;
	}

}
