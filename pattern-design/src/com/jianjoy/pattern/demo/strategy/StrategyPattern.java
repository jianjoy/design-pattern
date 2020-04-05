package com.jianjoy.pattern.demo.strategy; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午5:19:40
 * 
 */
public class StrategyPattern {

	
	
	public static void main(String[] args) {
		
		Context c = new Context();
		Strategy s = new ConcreteStategyA();
		c.setStrategy(s);
		
		c.contextInterface();
		
		Strategy s2 = new ConcreteStrategyB();
		c.setStrategy(s2);
		c.contextInterface();
		
	}
}
 