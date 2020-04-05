package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月13日 下午7:06:48
 * 
 */
public class StatePatternClient {
	
	
	public static void main(String[] args) {
		
		Contexts contexts = new Contexts();
		
		contexts.handle();
		
		contexts.handle();
		
		contexts.handle();
		
		contexts.handle();
		
		
		
	}

}
 