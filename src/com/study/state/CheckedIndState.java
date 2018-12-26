/**
 * 
 */
package com.study.state;

/**
 * 已入住状态
 * @author zhangtao
 *
 */
public class CheckedIndState implements State{

	@Override
	public void handle() {
		System.out.println("房间已入住，请勿打扰");
	}

}
