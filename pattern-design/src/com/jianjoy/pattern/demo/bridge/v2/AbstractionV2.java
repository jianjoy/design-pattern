package com.jianjoy.pattern.demo.bridge.v2; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2020年3月27日 下午3:14:16
 * 
 */
public abstract class AbstractionV2 {
	
	
	protected Implementor impl;
	
	public AbstractionV2(Implementor impl){
		this.impl=impl;
	}
	
	
	public void operation(){
		impl.operationImpl();
	}
	

}
 