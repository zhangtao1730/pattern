/**
 * 
 */
package com.study.chainOfResp;

/**
 * 副总经理
 * @author zhangtao
 *
 */
public class ViceGeneralManager extends Leader{

	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<20){
			System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("副总经理："+this.name+"，审批通过！");
		}else{
			if(this.newLeader!=null){
				this.newLeader.handleRequest(request);
			}
		}
	}

}
