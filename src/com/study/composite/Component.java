/**
 * 
 */
package com.study.composite;

/**
 * �������
 * @author zhangtao
 *
 */
public interface Component {
	void operation();
}
//Ҷ�����
interface Leaf extends Component{
	
}
//�������
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
