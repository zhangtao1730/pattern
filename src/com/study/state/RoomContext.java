/**
 * 
 */
package com.study.state;

/**
 * ����״̬
 * @author zhangtao
 *
 */
public class RoomContext {
	//���ʱ����ϵͳ�����Context�����˺ţ����ݽ�ͬ���л���ͬ��״̬
	private State state;
	
	public void setState(State s){
		System.out.println("�޸�״̬");
		state =s;
		state.handle();
	}
}
