package com.sutdy.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star real=new RealStar();
		Star proxy=new ProxyStar(real);
		proxy.sing();
	}
}
