/**
 * 
 */
package com.study.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ����ķָ����
 * @author zhangtao
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String str="aa3234afwae34wef34";
		String[] arrs=str.split("\\d+");
		System.out.println(Arrays.toString(arrs));
		
	}
}
