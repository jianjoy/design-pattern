package com.jianjoy.pattern.demo.visitor.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月14日 下午4:42:26
 * 
 */
public class ConcreteElementB implements Element {

	/* (non-Javadoc)
	 * @see com.demo.practice.visitor.v2.Element#accept(com.demo.practice.visitor.v2.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	
	
	public String operationB(){
		return "具体元素B的操作";
	}
}
 