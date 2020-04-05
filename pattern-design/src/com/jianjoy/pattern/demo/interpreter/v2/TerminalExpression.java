package com.jianjoy.pattern.demo.interpreter.v2; 

import java.util.HashSet;
import java.util.Set;

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午5:23:23
 * 
 */
public class TerminalExpression implements Expression {

	
	private Set<String> set = new HashSet<>();
	
	
	public TerminalExpression(String[] data){
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.demo.practice.interpreter.v2.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String info) {
		// TODO Auto-generated method stub
		
		if(set.contains(info)){
			return true;
		}
		
		return false;
	}

}
 