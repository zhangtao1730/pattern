/**
 * 
 */
package com.study.observer;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		//Ŀ�����
		ConcreteSubject subject =new ConcreteSubject();
		//��������۲���
		ObserverA obs1=new ObserverA();
		ObserverA obs2=new ObserverA();
		ObserverA obs3=new ObserverA();
		//���������۲�����ӵ�subject����Ĺ۲��߶�����
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		//�ı�subject��״̬
		subject.setState(3000);
		System.out.println("#####################");
		//�۲��ߵ�״̬�Ƿ����ı�
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		//�ı�subject��״̬
		subject.setState(30);
		System.out.println("#####################");
		//�۲��ߵ�״̬�Ƿ����ı�
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
