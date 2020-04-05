package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午6:25:50
 * 
 */
public class Contexts {
	
	private States states;
	
	public Contexts(){
		states = new ConcreteStatesA();
	}
	
	/**
	 * @param states the states to set
	 */
	public void setStates(States states) {
		this.states = states;
	}

	
	/**
	 * @return the states
	 */
	public States getStates() {
		return states;
	}
	
	public void handle(){
		states.Handle(this);
	}
}
 