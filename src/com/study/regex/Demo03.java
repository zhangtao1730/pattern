/**
 * 
 */
package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象的替换操作
 * @author zhangtao
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//在这个字符串：aewaoifjawe23894395，是否符合指定的正则表达式：\w+
		//表达式对象
		Pattern p=Pattern.compile("[0-9]");
		//创建Matcher对象
		Matcher m=p.matcher("aa3234**afwae34*wef34");
		//替换
		String newStr=m.replaceAll("#");
		System.out.println(newStr);
		
		//分割
		
	}
}
