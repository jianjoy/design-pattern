package com.jianjoy.pattern.demo.memento; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 上午11:51:45
 * 
 */
public class Originator {
	
	
	private String state = "";
	
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
	
	
	public Memento createMemento(){
		return new Memento(state);
	}
	
	
	public void restoreMemento(Memento m){
		this.setState(m.getState());
	}

}
 