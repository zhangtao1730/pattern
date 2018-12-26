/**
 * 
 */
package com.study.state;

/**
 * 空闲状态
 * @author zhangtao
 *
 */
public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("房间空闲，没忍住");
	}

}
