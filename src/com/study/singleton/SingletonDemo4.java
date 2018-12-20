package com.study.singleton;

/**
 * 测试静态内部类实现单例模式
 * 线程安全，调用效率高，并且实现了延时加载
 * @author zhangtao
 *
 */
public class SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance=new SingletonDemo4();
	}
	private SingletonDemo4(){
		
	}
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}
