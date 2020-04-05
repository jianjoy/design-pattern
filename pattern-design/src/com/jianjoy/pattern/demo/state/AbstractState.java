package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:16:31
 * 
 */
public abstract class AbstractState {
	
	
	
	protected ScoreContext hj;
	
	protected String stateName;
	
	protected int score;
	
	
	public abstract void checkState();
	
	
	public void addScore(int x){
		score +=x;
		System.out.println("加上:"+x+"分,\t当前分:"+score);
		
		checkState();
		
		System.out.println("分,\t当前状态:"+hj.getState().stateName);
	}
	
	
	
	

}
 