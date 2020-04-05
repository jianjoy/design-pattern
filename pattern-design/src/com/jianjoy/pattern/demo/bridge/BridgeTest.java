package com.jianjoy.pattern.demo.bridge; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 上午11:23:30
 * 
 */
public class BridgeTest {
	
	public static void main(String[] args) {
		
		
		Implementor imple = new ConcreteImplementorA();
		
		Abstraction abstraction = new RefinedAbstraction(imple);
		
		abstraction.Operation();
		
	}

}
 