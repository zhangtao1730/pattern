package com.study.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ���Զ���ʽ����ģ(��η�ֹ����ͷ����л�©��)
 * @author zhangtao
 *
 */
public class SingletonDemo6 implements Serializable {

	//���ʼ��ʱ��������(û����ʱ���ص�����)
	//���ڼ�����ʱ��Ȼ���̰߳�ȫ��
	private static SingletonDemo6 instance=new SingletonDemo6();
	
	private SingletonDemo6(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo6 getInstance(){
		return instance;
	}
	//�����л�ʱ�����������readResolve������ֱ�ӷ���
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
