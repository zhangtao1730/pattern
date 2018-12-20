package com.study.prototype;

import java.io.Serializable;
import java.util.Date;
//浅复制
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();//直接调用Object对象的克隆方法
		return obj;
	}

	public Sheep() {
		super();
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
}
