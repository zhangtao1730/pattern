/**
 * 
 */
package com.study.command;

/**
 * �����ߺͷ�����
 * @author zhangtao
 *
 */
public class Invoke {
	private Command command;//Ҳ����ͨ������List<Command>���ɺܶ�������󣬽������������ݿ�ײ����������������ģʽ

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	//ҵ�񷽷������ڵ���������ķ���
	public void call(){
		command.execute();
	}
}
