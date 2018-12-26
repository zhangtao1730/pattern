/**
 * 
 */
package com.study.strategy;

/**
 * @author zhangtao
 *
 */
public class OleCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("¥Ú∞À’€");
		return standardPrice*0.8;
	}

}
