/**
 * 
 */
package com.study.strategy;

/**
 * ����;���Ĳ����ཻ��
 * ������㷨��ֱ�ӵĿͻ��˵��÷��룬ʹ���㷨���Զ����ڿͻ��ˣ������ı仯
 * ���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ���Զ��󣬶�̬���л���ͬ�㷨
 * @author zhangtao
 *
 */
public class Context {
	private Strategy strategy;//��ǰ�����㷨
	//����ͨ��������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	//����ͨ��set������ע��
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double s){
		System.out.println("���ۣ�"+strategy.getPrice(s));
	}
}
