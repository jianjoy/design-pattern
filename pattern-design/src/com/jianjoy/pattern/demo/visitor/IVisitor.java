package com.jianjoy.pattern.demo.visitor; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:52:25
 * 
 */
public interface IVisitor {
	
	public void visit(ConcreteElement1 el1);
	
	public void visit(ConcreteElement2 el2);

}
 