package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:16:49
 * 
 */
public class ScoreContext {
	
	
	
	private AbstractState state;
	
	public ScoreContext(){
		
	}
	
	
	/**
	 * @param state the state to set
	 */
	public void setState(AbstractState state) {
		this.state = state;
	}
	
	/**
	 * @return the state
	 */
	public AbstractState getState() {
		return state;
	}
	
	
	public void add(int score){
		this.state.addScore(score);
	}
	
	

}
 