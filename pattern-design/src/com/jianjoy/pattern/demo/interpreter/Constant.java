package com.jianjoy.pattern.demo.interpreter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午10:53:55
 * 
 */
public class Constant implements Expression{

	
	private int i;
	
	public Constant(int i){
		this.i=i;
	}
	
	/* (non-Javadoc)
	 * @see com.demo.practice.interpreter.Expression#interpret(com.demo.practice.interpreter.Context)
	 */
	@Override
	public int interpret(Context context) {
		return i;
	}

}
 