/**
 * 
 */
package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ�Ļ����÷�
 * @author zhangtao
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//������ַ�����aewaoifjawe23894395���Ƿ����ָ����������ʽ��\w+
		//���ʽ����
		Pattern p=Pattern.compile("\\w+");
		//����Matcher����
		Matcher m=p.matcher("aewaoifjawe&&23894395");
//		boolean flag=m.matches();//���Խ������ַ��������ģʽƥ��
//		System.out.println(flag);
//		boolean flag2=m.find(); //�÷���ɨ����������У��������ģʽƥ�����һ��������
//		System.out.println(flag2);
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.group());
//		System.out.println(m.find());
//		System.out.println(m.group());
		while(m.find()){
			System.out.println(m.group());//group(),group(0)ƥ���������ʽ�����ַ���
			System.out.println(m.group(0));
		}
	}
}
