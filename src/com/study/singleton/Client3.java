package com.study.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 * @author zhangtao
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		long start=System.currentTimeMillis();
		int threadNum=10;
		final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
		for(int i=0;i<10;i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
//						Object o=SingletonDemo4.getInstance();
						Object o=SingletonDemo5.INSTANCE;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();//main�߳�������֪����������Ϊ 0���Ż��������ִ��
		long end=System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:"+(end-start));
		
		
	}
}
