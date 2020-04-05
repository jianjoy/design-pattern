package com.jianjoy.pattern.demo.interpreter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:50:35
 * 
 */
public class Variable implements Expression {

	/* (non-Javadoc)
	 * @see com.demo.practice.interpreter.Expression#interpret(com.demo.practice.interpreter.Context)
	 */
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.LookupValue(this);
	}

}
 