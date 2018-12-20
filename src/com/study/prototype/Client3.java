package com.study.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ԭ��ģʽ(���,ʹ�����л��ͷ����л�ʵ��)
 * @author zhangtao
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		Date date=new Date(1225122342551L);
		Sheep s1=new Sheep("����",date);
//		Sheep s2=(Sheep)s1.clone();

		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//ʹ�����л��ͷ����л�ʵ�����¡
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes=bos.toByteArray();
		
		ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
		ObjectInputStream ois=new ObjectInputStream(bis);
		Sheep s2=(Sheep)ois.readObject();
		
		date.setTime(1349384598340L);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("����");
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
		
	}
}
