/**
 * 
 */
package com.study.chainOfResp;

/**
 * ������
 * @author zhangtao
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader newLeader;//�������ϵĺ�̶���
	public Leader(String name) {
		super();
		this.name = name;
	}
	//�趨�������ĺ�������
	public void setNewLeader(Leader newLeader) {
		this.newLeader = newLeader;
	}
	/**
	 * ��������ĺ��ĵ�ҵ�񷽷�
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
	
}
