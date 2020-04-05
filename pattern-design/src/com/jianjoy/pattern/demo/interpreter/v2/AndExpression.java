package com.jianjoy.pattern.demo.interpreter.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午5:30:22
 * 
 */
public class AndExpression implements Expression{
	
	
	private Expression city;
	
	private Expression person;
	
	public AndExpression(Expression city,Expression person){
		this.city = city;
		this.person = person;
	}
	

	/* (non-Javadoc)
	 * @see com.demo.practice.interpreter.v2.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String info) {
		String s[]=info.split("的");
		return city.interpret(s[0])&&person.interpret(s[1]);
	}

}
 