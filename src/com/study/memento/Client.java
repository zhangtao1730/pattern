/**
 * 
 */
package com.study.memento;

/**
 * @author zhangtao
 *
 */
public class Client {
	public static void main(String[] args) {
		CareTaker taker=new CareTaker();
		Emp emp=new Emp("����",18,1000);
		System.out.println("��һ�δ�ӡ����"+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		taker.setMemento(emp.memento());
		emp.setAge(38);
		emp.setEname("����");
		emp.setSalary(10000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		emp.recovery(taker.getMemento());//�ָ�������¼���󱣴��״̬
		System.out.println("�����δ�ӡ����"+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		
	}
}
