/**
 * 
 */
package com.study.state;

/**
 * Ԥ��״̬״̬
 * @author zhangtao
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("������Ԥ�������˲��ܶ�");
	}

}
