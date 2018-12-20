package com.study.singleton;
/**
 * 测试懒汉式单例模式
 * @author zhangtao
 *
 */
public class SingletonDemo2 {

	//类初始化时不初始化(延时加载，真正使用时创建)
	private static SingletonDemo2 instance;
	
	private SingletonDemo2(){
		
	}
	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		return instance;
	}
}
