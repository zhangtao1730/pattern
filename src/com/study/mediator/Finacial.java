/**
 * 
 */
package com.study.mediator;

/**
 * @author zhangtao
 *
 */
public class Finacial implements Department{
	private Mediator m;//持有中介者(总经理)的引用
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("数钱！");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作！钱太多了，怎么花？");
	}
	
}
