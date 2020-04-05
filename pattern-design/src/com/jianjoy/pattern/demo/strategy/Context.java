package com.jianjoy.pattern.demo.strategy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:59:32
 * 
 */
public class Context {
	
	
	private Strategy strategy;
	

	
	
	public void contextInterface(){
		strategy.strategyInterface();
	}
	
	
	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}


 