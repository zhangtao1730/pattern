package com.study.prototype;

import java.util.Date;

/**
 * ����ԭ��ģʽ(ǳ��¡)
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(1225122342551L);
		Sheep s1=new Sheep("����",date);
		Sheep s2=(Sheep)s1.clone();

		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(1349384598340L);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("����");
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
	}
}
