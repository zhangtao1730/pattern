/**
 * 
 */
package com.study.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * �Զ���ľۺ���
 * @author zhangtao
 *
 */
public class ConcreteMyAggregate {
	private List<Object> list =new ArrayList<>();

	public void addObject(Object obj){
		this.list.add(obj);
	}
	public void removeObject(Object obj){
		this.list.remove(obj);
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	//��õ�����
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	
	//ʹ���ڲ��ඨ�������������ֱ��ʹ���ⲿ�������
	private class ConcreteIterator implements MyIterator{
		private int cursor;//�����α�������¼����ʱ��λ��
		@Override
		public void first() {
			cursor=0;
		}
		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
			}
		}
		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}
		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
		
	}
	
}
