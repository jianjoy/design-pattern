package com.jianjoy.pattern.demo.visitor; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月8日 下午5:52:43
 * 
 */
public abstract class Element {
	
	public abstract void accept(IVisitor visitor);
	
	public abstract void doSomething();

}
 