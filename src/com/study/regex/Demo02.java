/**
 * 
 */
package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ�����з���Ĵ���
 * @author zhangtao
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//������ַ�����aewaoifjawe23894395���Ƿ����ָ����������ʽ��\w+
		//���ʽ����
		Pattern p=Pattern.compile("([a-z]+)([0-9]+)");
		//����Matcher����
		Matcher m=p.matcher("aa3234**afwae34*wef34");

		while(m.find()){
			System.out.println(m.group());//group(),group(0)ƥ���������ʽ�����ַ���
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
