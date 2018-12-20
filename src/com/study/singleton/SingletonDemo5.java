package com.study.singleton;
/**
 * 测试枚举式单例模式(没有延时加载)
 * @author zhangtao
 *
 */
public enum SingletonDemo5 {
	//这个枚举元素本身就是单例模式
	INSTANCE;
	//添加自己需要的操作
	public void singletonOperation(){
		
	}
}
