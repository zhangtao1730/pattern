/**
 * 
 */
package com.study.state;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		RoomContext ctx=new RoomContext();
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
	}
}
