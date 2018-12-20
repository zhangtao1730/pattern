package com.study.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试饿汉式单例模(如何防止反射和反序列化漏洞)
 * @author zhangtao
 *
 */
public class SingletonDemo6 implements Serializable {

	//类初始化时立即加载(没有延时加载的优势)
	//由于加载类时天然是线程安全的
	private static SingletonDemo6 instance=new SingletonDemo6();
	
	private SingletonDemo6(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	//方法没有同步，调用效率高
	public static SingletonDemo6 getInstance(){
		return instance;
	}
	//反序列化时，如果定义了readResolve方法则直接返回
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
