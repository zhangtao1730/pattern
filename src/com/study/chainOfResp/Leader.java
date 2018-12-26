/**
 * 
 */
package com.study.chainOfResp;

/**
 * 抽象类
 * @author zhangtao
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader newLeader;//责任链上的后继对象
	public Leader(String name) {
		super();
		this.name = name;
	}
	//设定责任链的后续对象
	public void setNewLeader(Leader newLeader) {
		this.newLeader = newLeader;
	}
	/**
	 * 处理请求的核心的业务方法
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
	
}
