/**
 * 
 */
package com.study.strategy;

/**
 * 负责和具体的策略类交互
 * 具体的算法和直接的客户端调用分离，使得算法可以独立于客户端，独立的变化
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同策略对象，动态的切换不同算法
 * @author zhangtao
 *
 */
public class Context {
	private Strategy strategy;//当前采用算法
	//可以通过构造器注入
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	//可以通过set方法来注入
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double s){
		System.out.println("报价："+strategy.getPrice(s));
	}
}
