package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:17:51
 * 
 */
public abstract class Abstraction {
	
	protected Implementor imple;
	
	public Abstraction(Implementor imple){
		this.imple = imple;
	}
	
	
	public abstract void Operation();

}
 