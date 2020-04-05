package com.jianjoy.pattern.demo.responsibility; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午4:44:07
 * 
 */
public abstract class Handler {

	protected Handler successor;
	
	public abstract void handleRequest();
	
	public Handler getSuccessor(){
		return successor;
	}
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	
}
 