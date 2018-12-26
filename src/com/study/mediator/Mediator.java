/**
 * 
 */
package com.study.mediator;

/**
 * @author zhangtao
 *
 */
public interface Mediator {
	void register(String dname,Department d);
	
	void command(String dname);
}
