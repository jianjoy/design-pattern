package com.jianjoy.pattern.demo.responsibility; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月5日 下午4:48:27
 * 
 */
public class Client {
	
	
	public static void main(String[] args) {
		
		Handler handler1 = new ConcreteHandler();
			
		Handler handler2 = new ConcreteHandler();
		
		handler1.setSuccessor(handler2);
		
		handler1.handleRequest();
	}

}
 