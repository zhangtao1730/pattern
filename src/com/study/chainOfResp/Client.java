/**
 * 
 */
package com.study.chainOfResp;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader b2=new ViceGeneralManager("��С��");
		Leader c = new GeneralManager("����");
		//��֯����������Ĺ�ϵ
		a.setNewLeader(b);
		b.setNewLeader(b2);
		b2.setNewLeader(c);
		//��ʼ��ٲ���
		LeaveRequest req1=new LeaveRequest("TOM",10,"��Ӣ��");
		a.handleRequest(req1);
	}
}
