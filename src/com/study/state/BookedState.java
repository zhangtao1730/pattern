/**
 * 
 */
package com.study.state;

/**
 * 预定状态状态
 * @author zhangtao
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预定，别人不能定");
	}

}
