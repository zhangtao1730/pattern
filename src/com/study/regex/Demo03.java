/**
 * 
 */
package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ������滻����
 * @author zhangtao
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//������ַ�����aewaoifjawe23894395���Ƿ����ָ����������ʽ��\w+
		//���ʽ����
		Pattern p=Pattern.compile("[0-9]");
		//����Matcher����
		Matcher m=p.matcher("aa3234**afwae34*wef34");
		//�滻
		String newStr=m.replaceAll("#");
		System.out.println(newStr);
		
		//�ָ�
		
	}
}
