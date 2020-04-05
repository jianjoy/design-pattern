package com.jianjoy.pattern.demo.template; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:06:52
 * 
 */
public abstract class AbstractTemplate {
	
	
	
	public void templateMethod(){
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	
	
	protected abstract void abstractMethod();
	
	
	protected void hookMethod(){
		
	}
	
	
	private final void concreteMethod(){
		
	}

}
 