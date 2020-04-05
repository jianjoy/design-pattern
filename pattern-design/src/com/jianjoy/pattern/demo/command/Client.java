package com.jianjoy.pattern.demo.command; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午6:27:46
 * 
 */
public class Client {
	
	
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		
		Invoker invoker = new Invoker(command);
		
		invoker.aciton();
	
	}

}
 