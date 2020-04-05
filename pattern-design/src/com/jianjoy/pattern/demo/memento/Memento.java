package com.jianjoy.pattern.demo.memento; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:50:48
 * 
 */
public class Memento {
	
	private String state = "";
	
	public Memento(String state){
		this.state = state;
	}
	
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
 