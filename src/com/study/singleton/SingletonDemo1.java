package com.study.singleton;
/**
 * ���Զ���ʽ����ģʽ
 * @author zhangtao
 *
 */
public class SingletonDemo1 {

	//���ʼ��ʱ��������(û����ʱ���ص�����)
	//���ڼ�����ʱ��Ȼ���̰߳�ȫ��
	private static SingletonDemo1 instance=new SingletonDemo1();
	
	private SingletonDemo1(){
		
	}
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
