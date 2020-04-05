package com.jianjoy.pattern.demo.strategy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午5:17:59
 * 
 */
public class ConcreteStategyA implements Strategy {

	/* (non-Javadoc)
	 * @see com.demo.practice.strategy.Strategy#strategyInterface()
	 */
	@Override
	public void strategyInterface() {
		// TODO Auto-generated method stub
		System.out.println("具体策略A的策略方法被访问!");
	}

}
 