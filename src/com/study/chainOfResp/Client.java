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
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader b2=new ViceGeneralManager("李小四");
		Leader c = new GeneralManager("王五");
		//组织责任链对象的关系
		a.setNewLeader(b);
		b.setNewLeader(b2);
		b2.setNewLeader(c);
		//开始请假操作
		LeaveRequest req1=new LeaveRequest("TOM",10,"回英国");
		a.handleRequest(req1);
	}
}
