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
		Emp emp=new Emp("张三",18,1000);
		System.out.println("第一次打印对象："+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		taker.setMemento(emp.memento());
		emp.setAge(38);
		emp.setEname("李四");
		emp.setSalary(10000);
		System.out.println("第二次打印对象："+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		emp.recovery(taker.getMemento());//恢复到备忘录对象保存的状态
		System.out.println("第三次打印对象："+emp.getEname()+"--->"+emp.getAge()+"--->"+emp.getSalary());
		
	}
}
