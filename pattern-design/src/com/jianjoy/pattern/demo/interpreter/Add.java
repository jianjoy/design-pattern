package com.jianjoy.pattern.demo.interpreter; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 上午11:00:21
 * 
 */
public class Add implements Expression{
	
	private Expression left,right;
	
	
	public Add(Expression left,Expression right){
		this.left = left;
		this.right= right;
	}

	/* (non-Javadoc)
	 * @see com.demo.practice.interpreter.Expression#interpret(com.demo.practice.interpreter.Context)
	 */
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return left.interpret(context)+right.interpret(context);
	}

}
 