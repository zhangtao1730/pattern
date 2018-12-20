package com.study.singleton;
/**
 * ��������ʽ����ģʽ
 * @author zhangtao
 *
 */
public class SingletonDemo2 {

	//���ʼ��ʱ����ʼ��(��ʱ���أ�����ʹ��ʱ����)
	private static SingletonDemo2 instance;
	
	private SingletonDemo2(){
		
	}
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		return instance;
	}
}
