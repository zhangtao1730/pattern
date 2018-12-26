/**
 * 
 */
package com.study.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangtao
 *
 */
public class President implements Mediator{

	private Map<String,Department> map=new HashMap<>();
	@Override
	public void register(String dname, Department d) {
		map.put(dname, d);
	}

	@Override
	public void command(String dname) {
		map.get(dname).selfAction();
	}

}
