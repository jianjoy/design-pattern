package com.jianjoy.pattern.demo.state; 

/** 
 * @author  E-mail: jason@altamob.com
 *
 * @version 创建时间：2019年3月7日 下午5:18:30
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		
		
		State state = new ConcreteStateB();
		Context context = new Context();
		context.setState(state);
		
		context.request("test");
		
		
		
	}

}
 