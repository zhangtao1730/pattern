/**
 * 
 */
package com.study.composite;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5,f6;
		Folder f1=new Folder("�ҵ��ղ�");
		f2=new ImageFile("ͷ��.jpg");
		f3=new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		Folder f11=new Folder("��Ӱ");
		f4=new VideoFile("����ɱ.avi");
		f5=new VideoFile("����ɱ.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
//		f2.killVirus();
		f1.killVirus();
	}
}
